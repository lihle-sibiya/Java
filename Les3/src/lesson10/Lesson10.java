/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author Lihle
 */
public class Lesson10 {
    public static void main(String[] args) {
        //Ternary operator
//        int x =2, y = 5, z = 0;
//        z = (y < x) ? x : y;
//        System.out.println(z);

int numberOfGoals = 10;
String s = (numberOfGoals == 1 ) ? " goal" : " goals";
        System.out.println("I scored " + numberOfGoals + s);


    }
}
