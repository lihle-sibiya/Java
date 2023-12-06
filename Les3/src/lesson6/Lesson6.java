/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * @author Lihle
 */
public class Lesson6 {

    public static void main(String[] args) {
        Customer customer01 = new Customer();
        Customer customer02 = new Customer();

        customer01.age = 40;
        customer01.name = "Dutchess";
        customer02.age = 41;
        customer02.name = "Duke";
        customer01.displayCustomer();
        customer02.displayCustomer();

        System.out.println(customer01);
        System.out.println(customer02);
        customer01.cart.cancel();

        //Making the address the same as customer02, then they both point to the object of customer02
        customer01 = customer02;
        customer01.displayCustomer();
        customer02.displayCustomer();

    }

}

class Customer {

    public Cart cart = new Cart();
    public String name;
    public int age;

    public void displayCustomer() {
        System.out.println("Customer name is " + name + " and age is " + age);
    }

}

class Cart {

    public Item[] item;

    public void cancel() {
        System.out.println("cancelled cart");
    }
}

class Item {

}
