package utility;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.Arrays;

import soccer.Game;
import soccer.Goal;
import soccer.Team;

/**
 *
 * @author ksomervi
 */
public class GameUtils {

    public GameUtils() {
    }

    public static void addGameGoals(Game currGame) {

        if (currGame.goals == null) {
            currGame.goals = new Goal[(int) (Math.random() * 10)];   // If goals not initialized max will be 9
        }

        if (currGame.goals == null) {
            currGame.goals = new Goal[(int) (Math.random() * 10.0)];
        }

        int i = 0;
        Goal[] arr$ = currGame.goals;
        int len$ = arr$.length;

        for (int i$ = 0; i$ < len$; ++i$) {
            Goal var10000 = arr$[i$];
            Goal currGoal = new Goal();
            currGoal.theTeam = Math.random() > 0.5 ? getHomeTeam(currGame, "home") : getHomeTeam(currGame, "away");
            currGoal.thePlayer = currGoal.theTeam.playerArray[(int) (Math.random() * (double) currGoal.theTeam.playerArray.length)];
            currGoal.theTime = (double) ((int) (Math.random() * 90.0));
            currGame.goals[i] = currGoal;
            ++i;
        }

        Arrays.sort(currGame.goals, (var0, var1) -> {
            return Double.valueOf(var0.theTime).compareTo(var1.theTime);
        });
    }

    // Uses reflection so works with getter method or public field
    private static Team getHomeTeam(Game currGame, String homeOrAway) {
        Team theTeam = null;

        try {
            Method m = Game.class.getMethod("get" + Character.toUpperCase(homeOrAway.charAt(0)) + homeOrAway.substring(1) + "Team");
            theTeam = (Team) m.invoke(currGame);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException var8) {
            try {
                Field f = Game.class.getField(homeOrAway + "Team");
                theTeam = (Team) f.get(currGame);
            } catch (IllegalAccessException | NoSuchFieldException var7) {
                System.out.println("The addGoals() utility requires the Goal class to contain either:\npublic String fields called homeTeam and awayTeam, OR,\npublic accessor methods called getHomeTeam() and getAwayTeam().");
            }
        }

        return theTeam;
    }
}
