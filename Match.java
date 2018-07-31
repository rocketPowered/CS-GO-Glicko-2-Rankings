public class Match {

    public Match() {
    }

    public void playMatch(Team winningTeam, Team losingTeam) {
        //First we get the players of the winning team, and players of losing team
        //  We will also create a copy of these two teams to run matches against
        Player[] wTeam = winningTeam.getPlayers();
        Player[] wTeamCopy = winningTeam.copyOf();

        Player[] lTeam = losingTeam.getPlayers();
        Player[] lTeamCopy = losingTeam.copyOf();

        //create the glicko object that we will use for calculations
        Glicko g = new Glicko();

        //calculate rankings for winning team
        for (Player player : wTeam) {
            g.glicko(player, lTeamCopy, 1);
        }

        //calculate rankings for losing team
        for(Player player : lTeam) {
            g.glicko(player, wTeamCopy, 0);
        }
    }
}
