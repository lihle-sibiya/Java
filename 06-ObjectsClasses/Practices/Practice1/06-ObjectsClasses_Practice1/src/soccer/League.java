/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soccer;

/**
 *
 * @author Lihle
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //8(a
        Player player1 = new Player();
        //b
        player1.playerName = "George Elliot";
        
       //c 
       Player player2 = new Player();
        player2.playerName = "Graham Greene";
        
        //d
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        
        //e
        Player[] thePlayers = {player1, player2, player3};
   
        //f
        Team team1 = new Team();
        
        //g
        team1.teamName = "The Greens";
        
        //h
        team1.playerArray = thePlayers;
    
    //9. a
    for (Player thePlayer: team1.playerArray){
        //b
        System.out.println(thePlayer.playerName);
    }
    
    System.out.println("********");
    
    //10
  player1.playerName = "Robert Service";
    
    for (Player thePlayer: team1.playerArray){
        //10 a
        System.out.println(thePlayer.playerName);
    }
    System.out.println("********");
    
    //11
    //a
    Team team2 = new Team();
    team2.teamName = "The Reds";
    
    //b
    team2.playerArray = new Player[3];
    
    //c
    team2.playerArray[0] = new Player();
    team2.playerArray[0].playerName = "Robert Service";
    
    //d
    team2.playerArray[1] = new Player();
    team2.playerArray[1].playerName = "Robbie Burns";
    team2.playerArray[2] = new Player();
    team2.playerArray[2].playerName = "Rafael Sabatini";
    
    
    
    //11 e
    for (Player thePlayer: team2.playerArray){
        //10 a
        System.out.println(thePlayer.playerName);
    }
    System.out.println("********");
    
    
   
    
    
    }
    
}
