package ex13_1_exercise;

//Exercise 13-1

import java.util.ArrayList;
import java.util.Arrays;

//
//1. Convert the days array to an ArrayList.
//     Use Arrays.asList to return a List.  
//     Use that List to initialize a new ArrayList.  
//     Preferably do this all on one line.
//2. Iterate through the ArrayList, testing to see if an element is "sunday".
//     If it is a "sunday" element, print it out, converting it to upper case.
//     Use:
//       (from the String class)
//         
//        
// 
//     If it is not "sunday", print it out anyway, but not in upper case.
//
//3. After the for loop print out the ArrayList.
//     While within the loop, did "sunday" get printed in upper case?
//     Was the "sunday" element in the array converted to upper case?
//     Your instructor will explain what's going on in the next topic.
public class ShoppingCart {

    public static void main(String[] args) {
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
        
      
    }
}
