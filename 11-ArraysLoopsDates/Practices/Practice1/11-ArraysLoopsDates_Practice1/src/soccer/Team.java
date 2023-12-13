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
public class Team {

    private String teamName;
    private Player[] playerArray;
    private int pointsTotal;
    private int goalsTotal;

    public void incGoalsTotal(int goals) {
        this.setGoalsTotal(this.getGoalsTotal() + goals);
    }

    public void incPointsTotal(int points) {
        this.pointsTotal += points;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, Player[] players) {
        this(teamName);
        this.playerArray = players;
    }

    public Team() {
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return this.playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    public int getPointsTotal() {
        return this.pointsTotal;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public int getGoalsTotal() {
        return this.goalsTotal;
    }

    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }
}
