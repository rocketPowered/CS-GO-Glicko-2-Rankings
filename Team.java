
public class Team {
    private Player[] players;

    private String name;
    private double rating;
    private double rd;

    public Team(String name) {
        players = new Player[5];
        this.name = name;

    }

    public Player[] getPlayers() {
        return players;
    }

    public double getRating() {
        return rating;
    }

    public double getRd() {
        return rd;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        int i = 0;
        while (i < players.length) {
            if (players[i] == null) {
                players[i] = player;
                i = players.length;
            }
        }
    }

    public void removePlayer(Player player) {
        int i = 0;
        while (i < players.length) {
            if (players[i] == player) {
                players[i] = null;
                i = players.length;
            }
        }
    }

    public void renameTeam(String name) {
        this.name = name;
    }

    /*
    Rating and volatility of a team should be the average of the 5 players on that team
    If a team has less than five players, then the ratings will reflect this by olosing points
    Alternatively, if a player from a high ranked team joins a lower ranked team, this could
        boost that teams rating a bit
     */
    public void updateRating() {
        double temp = 0;
        for (int i = 0; i < players.length; i++) {
            temp += players[i].getRating();
        }
        rating = temp / players.length;
    }

    public void updateRd() {
        double temp = 0;
        for (int i = 0; i < players.length; i++) {
            temp += players[i].getRd();
        }
        rd = temp / players.length;
    }

    /*
    Return a new player array that contains a copy of the 5 players on the team
    This is used for match calculation. As we have each player on the team simulate a game against each
        player on the other team, we don't want rating changes to take affect before all calculations are run
    This method should help, because we can calculate rating using copies, and then add changes to the actual player
     */
    public Player[] copyOf() {
        Player[] copy = new Player[5];
        for(int i = 0; i < players.length; i++) {
            copy[i] = players[i].copyOf();
        }
        return copy;
    }

    public String toString() {
        return name + ": rating = " + rating + ", rd = " + rd;
    }


}
