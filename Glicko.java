public class Glicko {
    //tau helps determine how easily the rankings change based on results. Low tau = low swing on upsets
    private static final double TAU = 1;

    //this factor is added to deal with the fact that players are playing on a team, so we will scale down
    //  any gains in elo to account for the fact that they are 1/5 of the performance
    private static final double FACTOR = 0.85;

    //This value is the convergence tolerance, epsilon. We set this value to a small value,
    //  in this case the value is one suggested by the glicko-2 outline
    private static final double EPSILON = 0.000001;

    //these two numbers are needed for calculations of the glicko algorithm
    private static final double MAGIC = 173.7178;
    private static final double PI2 = Math.pow(Math.PI,2);

    public Glicko() {

    }

    /*
    Here we will run the glicko-2 algorithm
     */
    public void glicko(Player p, Player[] opps, double score) {
        //Step one is to get a rating for every player, something done already
        //Volatility is something set per application, so we will not be changing it at all but it is used
        //  in calculations. This value, along with TAU, could be tweaked to be optimal for CS:GO

        //Step 2, convert to glicko-2 scale from glicko-1
        double[] playerConvert = convertDoubles(p);
        double rating = playerConvert[0];
        double rd = playerConvert[1];
        double vol = playerConvert[2];

        //Step 3, compute quantity v, estimated variance based on game outcomes
        double v = 0;
        for (int i = 0; i < opps.length; i++) {
            double[] oppConvert = convertDoubles(opps[i]);
            double eVal = e(rating, oppConvert[0], oppConvert[1]);
            v += Math.pow(g(oppConvert[1]), 2) * eVal * (1 - eVal);
        }
        v = Math.pow(v, -1);

        //Step 4, compute delta, estimated improvement in rating based on pre-period rating compared to game outcomes
        double delta = 0;
        for (int i = 0; i < opps.length; i++) {
            double[] oppConvert = convertDoubles(opps[i]);
            double eVal = e(rating, oppConvert[0], oppConvert[1]);
            delta += g(oppConvert[1]) * (score - eVal);
        }
        delta *= v; //delta is change in rating

        //Step 5, determine new volatility
        //Setting up some initial values that will be useful for calculation
        double deltaSquared = Math.pow(delta, 2);
        double rdSquared = Math.pow(rd, 2);

        //5.1
        double a = Math.log(Math.pow(vol,2));

        //5.2
        double bigA = a;
        double bigB = 0;
        if (deltaSquared > rdSquared + v) {
            bigB = Math.log(deltaSquared - rdSquared - v);
        } else {
            double k = 1;
            while (f(a - k * TAU, a, deltaSquared, rdSquared, v) < 0) {
                k = k + 1;
            }
            bigB = a - k * TAU;
        }

        //5.3
        double f_a = f(bigA, a, deltaSquared, rdSquared, v);
        double f_b = f(bigB, a, deltaSquared, rdSquared, v);

        //5.4
        while (Math.abs(bigB - bigA) > EPSILON) {
            //a
            double bigC = bigA + (bigA - bigB) * f_a / (f_b - f_a);
            double f_c = f(bigC, a, deltaSquared, rdSquared, v);
            //b
            if (f_c * f_b < 0) {
                bigA = bigB;
                f_a = f_b;
            } else {
                f_a = f_a / 2;
            }
            //c
            bigB = bigC;
            f_b = f_c;
        }

        //5.5
        double newVol = Math.exp(bigA/2);


        //Step 6, update rating deviation to new pre-rating period value
        double rdStar = Math.sqrt(rdSquared + Math.pow(newVol,2));

        //Step 7, update rating and RD
        double newRd = 1 / (Math.sqrt((1/Math.pow(rdStar,2)) + (1/v)));
        //Slight change here, we are scaling the new rating by a factor, to account for the fact that
        //  each player in on a team
        double newRating = rating + FACTOR * (Math.pow(newRd,2) * (delta / v)) ;

        //Step 8, convert glicko-2 numbers back to glicko 1
        newRating = newRating * MAGIC + 1500;
        newRd = newRd * MAGIC;

        //There is an additional step here if a player doesn't compete during a rating period, but I am ignoring this

        //Now we are done, so let's update the player in question's rating and rd
        p.setRating(newRating);
        p.setRd(newRd);

    }

    /*
    Return an array with 3 values, converting Glicko-1 values to Glicko-2
    array[0] will contain the updated rating
    array[1] will contain the updated rating deviation
    array[2] will contain the updated volatility
     */
    private double[] convertDoubles(Player p) {
        double[] converted = new double[3];
        converted[0] = (p.getRating()-1500)/MAGIC;
        converted[1] = p.getRd()/MAGIC;
        converted[2] = p.getVolatilility();
        return converted;
    }

    /*
    Calculates function g, part of glicko-2 process
    Requires a rating deviation to calculate
     */
    private double g(double rd) {
        return (1) / (Math.sqrt(1 + ((3 * Math.pow(rd,2)) / (PI2)) ));
    }

    /*
    Calculates function E, part of glicko-2 process
    Requires player rating, plus opponent rating and rating deviation
     */
    private double e(double pRating, double oRating, double oRd) {
        return (1) / (1 + Math.exp((-g(oRd)) * (pRating - oRating)) );
    }

    /*
    Calculates function f(x), used in step 5 of the glicko-2 process
     */
    private double f(double x, double a, double deltaSquared, double rdSquared, double v) {
        double exp = Math.exp(x);
        return (
                ((exp) * (deltaSquared - rdSquared - v - exp)) / (2 * Math.pow(rdSquared + v + exp,2))
                - (x - a) / (Math.pow(TAU,2))
        );
    }
}
