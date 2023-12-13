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

    // Processing a Two-Dimensional Array
    static int sales[][] = new int[3][4];
    static int[][] salesArray = initArray(sales);

    public static void main(String[] args) {
        // LocalDate myDate = LocalDate.now();
        // System.out.println("Today's date: " + myDate);
        // System.out.println(myDate.format(DateTimeFormatter.ISO_LOCALDATE));
        // JapaneseDate jDate = JapaneseDate.from(myDate);
        // System.out.println(jDate);
        // System.out.println(myDate.minusMonths(15));
        // LocalDateTime today = LocalDateTime.now();
        // System.out.println(today);
        //
        // int height = 4;
        // int width = 10;
        //
        // for (int row = 0; row < height; row++) {
        //     for (int col = 0; col < width; col++) {
        //         System.out.print("@");
        //     }
        //     System.out.println();
        // }
        //
        // String name = "Lihle";
        // String guess = "";
        // int attempts = 0;
        // while (!guess.equalsIgnoreCase(name)) {
        //     guess = "";
        //     while (guess.length() < name.length()) {
        //         char asciiChar = (char) (Math.random() * 26 + 97);
        //         guess += asciiChar;
        //     }
        //     attempts++;
        // }
        // System.out.println(name + " found after " + attempts + " tries!");

        System.out.println("Yearly sales by quarter beginning 2010:");
        for (int i = 0; i < salesArray.length; i++) {
            for (int j = 0; j < salesArray[i].length; j++) {
                System.out.print("\tQ" + (j + 1) + " " + salesArray[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        ArrayList<String> names;
        names = new ArrayList();

        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        names.add("Prashant");

        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Gustav");

        System.out.println(names);
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
