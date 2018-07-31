import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RankingMain {
    public static void main(String [] args) {
        //Here we will store every player and team that we find in our rankings
        Set<Team> teams = new HashSet<>();
        Set<Player> players = new HashSet<>();

        //create our Match object which we will use to run matches and update rankings
        Match m = new Match();

        initSetup(teams, players);


    }

    public static void initSetup(Set<Team> teams, Set<Player> players) {

    }

}
