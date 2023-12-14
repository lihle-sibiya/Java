/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import static javax.swing.Spring.width;
import javax.swing.SpringLayout;

/**
 *
 * @author Lihle
 */
public class Lesson11 {

    public static void main(String[] args) {
//        int[][] yearlySales;
//        yearlySales = new int[5][4];
//
//        yearlySales[0][0] = 1000;
//        yearlySales[0][1] = 1000;
//        yearlySales[0][2] = 1000;
//        yearlySales[1][0] = 1000;
//        yearlySales[3][3] = 1000;

//        System.out.println("/*");
//        int counter  =0;
//        while(counter < 3)
//        {
//            System.out.println("*");
//            counter ++;
//        }
//        System.out.println("*/");
//        for (int i = 1; i < 5; i++)
//        {
//            System.out.println("i = " +i  +"; ");
//        }
//        
//        
//        int i =0;
//        while (i < 3)
//        {
//            System.out.println("i = " + i+"; ");
//            i++;
//            
//        }
//        String[] names = {"Ben", "Sechaba"};
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//factorial(5);
//int height = 4, width = 10;
//for (int row = 0; row< height; row++)
//{
//    for (int col = 0; col < width; col++)
//    {
//        System.out.print("@");
//    }
//    System.out.println();
//}
//find name exapmple
//        String name = "Sam";
//        String guess = "";
//        int attempts = 0;
//
//        while (!guess.equalsIgnoreCase(name)) {
//            guess = "";
//            while (guess.length() < name.length()) {
//                char asciiChar = (char) (Math.random() * 26 + 97);
//                guess += asciiChar;
//            }
//            attempts++;
//        }
//        System.out.println(name + " found after " + attempts + " tries");
//    }
//    static void factorial(int target) {
//
//        int save = target;
//        int fact = 1;
//
//        do {
//            fact *= target--;
//
//        } while (target > 0);
//        System.out.println("Factorial for " + save + ": " + fact);
//    }
        //sales example
        int sales[][] = new int[3][4];
        int[][] salesArray = initArray(sales);
        for (int i = 0;
                i < salesArray.length;
                i++) {
            for (int j = 0; j < salesArray[i].length;
                    j++) {
                System.out.println("tQ" + (j+1) + " " +salesArray[i][j]);
            }
            System.out.println ();
        }
    }

    static int[][] initArray(int[][] salesArray) {
        int salesAmt = 100;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 0; inner < 4; inner++) {
                salesArray[outer][inner] = salesAmt++;
            }
        }
        return salesArray;
    }
}
