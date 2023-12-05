/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_2_exercise;

/**
 *
 * @author Lihle
 */
//Exercise 4-2
//
//1. Declare and initialize numeric fields. Include price and tax (double), 
//     quantity (int). Also declare a double called total, but do not initialize it.
//2. Change the message variable to include quantity 
//      (example: "Mary Smith wants to purchase 1 Shirt.")
//3. Calculate total by multiplying price * quantity * tax.
//4. Print a message showing the total cost. 
//      (example:  "Total cost with tax is: 25.78.") 
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Usanda";
        String itemDesc = "Pizza";
        String message;

        double price = 50, tax = 10, total;
        int quantity = 5;
               
        message = custName + " " + "loves to eat" + " " + quantity + " " + "slices of" + " " + itemDesc + ".";
        System.out.println(message);

         total = price * quantity * tax;
         message = "The total amount inclusive of tax is:" + " " + total + ".";
         System.out.println(message);
    }
}
