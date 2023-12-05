/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_1_exercise;

/**
 *
 * @author Lihle
 */
//Exercise 5-1:
//
//1. Declare a boolean, outOfStock, and initialize it to true.
//2. Use an if statement to test the value of quantity.  
//    If it is > 1, concatenate an 's' to message so that it indicates multiple items.
//3. Use an if | else statement that tests the value of outOfStock.
//    If true, let the user know the item is unavailable.
//    If false, print the message variable, then print the total cost with tax.
//4. Run with outOfStock = true and then again with outOfStock = false.
public class Lesson5 {

    public static void main(String[] args) {
        String custName = "Usanda";
        String itemDesc = "Pizza";
        String message;

        double price = 50, tax = 10, total;
        int quantity = 5;

        message = custName + " " + "loves to eat" + " " + quantity + " " + itemDesc;
        //System.out.println(message);

        total = price * quantity * tax;

        //1 
        boolean outOfStock = true;

        //2
        if (quantity > 1) {
            System.out.println(message + "s");
        }

//         else {
//             message = custName + " " + "loves to eat" + " " + quantity + " " + itemDesc + ".";
//         
        //3
        //If true
        if (outOfStock) {
            System.out.println("Item is unavailable.");
        } //if false
        else {
            System.out.println(message);
        }
        

    }
}
