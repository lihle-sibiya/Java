/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Lihle
 */
public class TestLesson13 {

    public static void main(String[] args) {

//        Trousers t1 = new Trousers();
//        Clothing c1 = new Trousers();
//        Returnable r1 = new Trousers();
//        
//        t1.display();
//        t1.getItemID();
//        t1.doReturn();
//        t1.getFit();
//        
//        c1.display();
//        c1.getItemID();
//        
//        r1.doReturn();
//        
//        if (c1 instanceof Trousers) {
//            System.out.println(((Trousers)cl).getFit());
//        }
//        if (r1 instanceof Trousers) {
//            System.out.println(((Trousers) r1).getFit());
//       }
   // }
//    String[] nums = {"one", "two", "three"};
//    ArrayList<String> myArrayList =  new ArrayList(Arrays.asList(nums));

    
 String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};

        // Convert the days array into an ArrayList
    // Loop through the ArrayList, printing out "sunday" elements in 
//   upper case (use toUpperCase() method of String class) 
        // Print all other days in lower case 
        // Print out the ArrayList    
        ArrayList<String> daysArrayList = new ArrayList(Arrays.asList(days));
        for (String day : daysArrayList) {
            if (day.equalsIgnoreCase("sunday")) {
                System.out.println(day.toUpperCase());
            } else {
                System.out.println(day.toLowerCase());
            }
        }
        System.out.println(daysArrayList);
        
        daysArrayList.replaceAll(day -> day.toUpperCase());
        System.out.println(daysArrayList);
    daysArrayList.removeIf(day -> day.equalsIgnoreCase("saturday"));
        System.out.println(daysArrayList);
    }

}
