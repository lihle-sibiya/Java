/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Arrays;
import soccer.*;

/**
 *
 * @author Administrator
 */
public class GameUtils {
   public GameUtils() {
   }

   public static void addGameGoals(Game currGame) {
      if (currGame.getGoals() == null) {
         currGame.setGoals(new Goal[(int)(Math.random() * 10.0)]);
      }

      int i = 0;
      Goal[] arr$ = currGame.getGoals();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Goal var10000 = arr$[i$];
         Goal currGoal = new Goal();
         currGoal.setTheTeam(Math.random() > 0.5 ? currGame.getHomeTeam() : currGame.getAwayTeam());
         currGoal.setThePlayer(currGoal.getTheTeam().getPlayerArray()[(int)(Math.random() * (double)currGoal.getTheTeam().getPlayerArray().length)]);
         currGoal.setTheTime((double)((int)(Math.random() * 90.0)));
         currGame.getGoals()[i] = currGoal;
         ++i;
      }

      Arrays.sort(currGame.getGoals(), (var0, var1) -> {
         return Double.valueOf(var0.getTheTime()).compareTo(var1.getTheTime());
      });
   }
}
