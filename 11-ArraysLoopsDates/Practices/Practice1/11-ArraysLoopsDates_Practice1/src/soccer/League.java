package soccer;

import java.util.ArrayList;
import java.util.StringTokenizer;
import utility.PlayerDatabase;

public class League {
   public League() {
   }

   public static void main(String[] args) {
      League theLeague = new League();
      Team[] theTeams = theLeague.createTeams("The Robins,The Crows,The Swallows", 5);
      Game[] theGames = theLeague.createGames(theTeams);
      Game[] arr$ = theGames;
      int len$ = theGames.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Game currGame = arr$[i$];
         currGame.playGame();
         System.out.println(currGame.getDescription());
      }

      theLeague.showBestTeam(theTeams);
   }

   public Team[] createTeams(String teamNames, int teamSize) {
      PlayerDatabase playerDB = new PlayerDatabase();
      StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
      Team[] theTeams = new Team[teamNameTokens.countTokens()];

      for(int i = 0; i < theTeams.length; ++i) {
         theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
      }

      return theTeams;
   }

   public Game[] createGames(Team[] theTeams) {
      ArrayList<Game> theGames = new ArrayList();
      Team[] arr$ = theTeams;
      int len$ = theTeams.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Team homeTeam = arr$[i$];
         Team[] arr$ = theTeams;
         int len$ = theTeams.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            Team awayTeam = arr$[i$];
            if (homeTeam != awayTeam) {
               theGames.add(new Game(homeTeam, awayTeam));
            }
         }
      }

      return (Game[])((Game[])theGames.toArray(new Game[1]));
   }

   public void showBestTeam(Team[] theTeams) {
      Team currBestTeam = theTeams[0];
      System.out.println("\nTeam Points");
      Team[] arr$ = theTeams;
      int len$ = theTeams.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Team currTeam = arr$[i$];
         System.out.println(currTeam.getTeamName() + " : " + currTeam.getPointsTotal() + " : " + currTeam.getGoalsTotal());
         currBestTeam = currTeam.getPointsTotal() > currBestTeam.getPointsTotal() ? currTeam : currBestTeam;
         if (currTeam.getPointsTotal() > currBestTeam.getPointsTotal()) {
            currBestTeam = currTeam;
         } else if (currTeam.getPointsTotal() == currBestTeam.getPointsTotal() && currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
            currBestTeam = currTeam;
         }
      }

      System.out.println("Winner of the League is " + currBestTeam.getTeamName());
   }
}