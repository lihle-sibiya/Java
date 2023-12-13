/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import utility.GameUtils;

/**
 *
 * @author Administrator
 */
public class Game {
   private Team homeTeam;
   private Team awayTeam;
   private Goal[] goals;
   private LocalDateTime theDateTime;

   public Game(Team homeTeam, Team awayTeam, LocalDateTime theDateTime) {
      this.homeTeam = homeTeam;
      this.awayTeam = awayTeam;
      this.theDateTime = theDateTime;
   }

   public void playGame(int maxGoals) {
      int numberOfGoals = (int)(Math.random() * (double)maxGoals + 1.0);
      Goal[] theGoals = new Goal[numberOfGoals];
      this.setGoals(theGoals);
      GameUtils.addGameGoals(this);
   }

   public void playGame() {
      this.playGame(6);
   }

   public String getDescription() {
      int homeTeamGoals = 0;
      int awayTeamGoals = 0;
      StringBuilder returnString = new StringBuilder();
      returnString.append(this.getHomeTeam().getTeamName() + " vs. " + this.getAwayTeam().getTeamName() + "\n" + "Date: " + this.getTheDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");
      Goal[] arr$ = this.getGoals();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Goal currGoal = arr$[i$];
         if (currGoal.getTheTeam() == this.homeTeam) {
            ++homeTeamGoals;
            this.homeTeam.incGoalsTotal(1);
         } else {
            ++awayTeamGoals;
            this.awayTeam.incGoalsTotal(1);
         }

         returnString.append("Goal scored after " + currGoal.getTheTime() + " mins by " + currGoal.getThePlayer().getPlayerName() + " of " + currGoal.getTheTeam().getTeamName() + "\n");
      }

      if (homeTeamGoals == awayTeamGoals) {
         returnString.append("It's a draw!");
         this.homeTeam.incPointsTotal(1);
         this.awayTeam.incPointsTotal(1);
      } else if (homeTeamGoals > awayTeamGoals) {
         returnString.append(this.homeTeam.getTeamName() + " win");
         this.homeTeam.incPointsTotal(1);
      } else {
         returnString.append(this.awayTeam.getTeamName() + " win");
         this.awayTeam.incPointsTotal(1);
      }

      returnString.append(" (" + homeTeamGoals + " - " + awayTeamGoals + ") \n");
      return returnString.toString();
   }

   public Team getHomeTeam() {
      return this.homeTeam;
   }

   public void setHomeTeam(Team homeTeam) {
      this.homeTeam = homeTeam;
   }

   public Team getAwayTeam() {
      return this.awayTeam;
   }

   public void setAwayTeam(Team awayTeam) {
      this.awayTeam = awayTeam;
   }

   public Goal[] getGoals() {
      return this.goals;
   }

   public void setGoals(Goal[] goals) {
      this.goals = goals;
   }

   public LocalDateTime getLocalDateTime() {
      return this.getTheDateTime();
   }

   public void setLocalDateTime(LocalDateTime theDateTime) {
      this.setTheDateTime(theDateTime);
   }

   public LocalDateTime getTheDateTime() {
      return this.theDateTime;
   }

   public void setTheDateTime(LocalDateTime theDateTime) {
      this.theDateTime = theDateTime;
   }
}
