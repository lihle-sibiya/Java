/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class Goal {
   private Team theTeam;
   private Player thePlayer;
   private double theTime;

   public Goal() {
   }

   public Team getTheTeam() {
      return this.theTeam;
   }

   public void setTheTeam(Team theTeam) {
      this.theTeam = theTeam;
   }

   public Player getThePlayer() {
      return this.thePlayer;
   }

   public void setThePlayer(Player thePlayer) {
      this.thePlayer = thePlayer;
   }

   public double getTheTime() {
      return this.theTime;
   }

   public void setTheTime(double theTime) {
      this.theTime = theTime;
   }
}
