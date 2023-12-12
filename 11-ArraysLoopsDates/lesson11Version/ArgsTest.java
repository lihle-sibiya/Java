/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

/**
 *
 * @author dmtshoeni
 */
public class ArgsTest {
    public static void main(String[] args) {
        int args1 = Integer.parseInt(args[0]);
         int args2 = Integer.parseInt(args[1]);
        System.out.println("Args [0] is "+ args1);
        System.out.println("Args [1] is "+ args2);
        
        System.out.println(args1+ args2);
        
        
    }
    
}
