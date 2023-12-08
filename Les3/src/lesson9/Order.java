/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author Lihle
 */
public class Order {
    public static void main(String[] args) {
        Customer cust = new Customer(1);
        Item item = new Item();
        //item.price = 100;
        cust.setLoyaltyPoints(true);
        //setter method to change price
        item.setPrice(cust);
    }
    
    
    
}
