/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.StringTokenizer;
import utility.PlayerDatabase;

/**
 *
 * @author Administrator
 */
public class League {
   public League() {
   }

   public static void main(String[] args) {
      League theLeague = new League();
      Team[] theTeams = theLeague.createTeams("The Robins,The Crows,The Swallows", 5);
      Game[] theGames = theLeague.createGames(theTeams);
      System.out.println(theLeague.getLeagueAnnouncement(theGames));
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
   int daysBetweenGames = 0;
   ArrayList<Game> theGames = new ArrayList<>();
   Team[] arr$ = theTeams;
   int len$ = theTeams.length;

   for (int i$ = 0; i$ < len$; ++i$) {
      Team homeTeam = arr$[i$];
      Team[] awayTeams = theTeams; // Use a different variable name here
      int lenAway = theTeams.length;

      for (int j$ = 0; j$ < lenAway; ++j$) {
         Team awayTeam = awayTeams[j$];
         if (homeTeam != awayTeam) {
            daysBetweenGames += 7;
            theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays((long) daysBetweenGames)));
         }
      }
   }

   return theGames.toArray(new Game[0]);
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

   public String getLeagueAnnouncement(Game[] theGames) {
      Period thePeriod = Period.between(theGames[0].getTheDateTime().toLocalDate(), theGames[theGames.length - 1].getTheDateTime().toLocalDate());
      return "The league is scheduled to run for " + thePeriod.getMonths() + " month(s), and " + thePeriod.getDays() + " day(s)\n";
   }
}
