/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_2_exercise;

import ex04_2_exercise.*;

/**
 *
 * @author Lihle
 */
//Exercise 5-2
//
//1. Declare a String array and initialize it with 4 elements.
//     Each element represents a different item description ("Shirt", for instance).
//2. Change message to show how many items the customer wants to purchase 
//     (Use the length property of the items array).
//3. Print just one element of the items array.  
//     What happens if you use index number 4?
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Usanda";
        String message = custName + " " + "loves to purchase" + "food.";
        String[] food = {"Pizza", "Ice cream", "Noodles", "Pasta"};
 
         message = custName + " " + "loves to purchase" + " " + food.length + " " + "meals.";
         System.out.println(message);
         
         System.out.println("The second food purchased is" + " " + food[3]);
    }
}
