public class Player {
    private String name;
    private double rating;
    private double rd;
    private double volatility;

    public Player(String name) {
        this.name = name;
        rating = 1500;
        rd = 350;
        volatility = 0.06;
    }

    public Player(String name, double rating, double rd, double volatility) {
        this.name = name;
        this.rating = rating;
        this.rd = rd;
        this.volatility = volatility;
    }

    public double getRating() {
        return rating;
    }

    public double getRd() {
        return rd;
    }

    public double getVolatilility() {
        return volatility;
    }

    public String getName() {
        return name;
    }

    public void setRating(double newRating) {
        rating = newRating;
    }

    public void setRd(double newRd) {
        rd = newRd;
    }


    /*
    Important for the Team copyOf Method, returns a new player for purpose of making ratings work correctly
     */
    public Player copyOf() {
        return new Player(name, rating, rd, volatility);
    }

    public String toString() {
        return "Name: " + name + ", rating: " + rating + ", rd: " + rd;
    }
}
