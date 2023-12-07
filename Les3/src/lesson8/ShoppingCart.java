/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author Lihle
 */
public class ShoppingCart {

    public static void main(String[] args) {
//        Shirt myShirt = new Shirt();
//        Shirt yourShirt = new Shirt("long sleeve", 'R', 10.99);
//        myShirt.display();
//        yourShirt.display();
//        System.out.println("end of main method");
//        Lesson8.printString();

//        Shirt shirt01 = new Shirt("Sailor", "Blue", 30);
//        Shirt shirt02 = new Shirt("Sweatshirt", "Green", 25);
//        Shirt shirt03 = new Shirt("Skull Tree", "Blue", 15);
//        Shirt shirt04 = new Shirt("Tropical", "Red", 20);
//        shirt01.setFields("Sailor", 'B', 30);
//        shirt02.setFields("Sweatshirt", 'G', 25);
//        shirt03.setFields("Skull Tree", 'B', 15);
//        shirt04.setFields("Tropical", 'R', 20);
        
//Shirt myShirt = new Shirt();
//        System.out.println("Shirt color: " + myShirt.colorCode);
//        changeShirtColor(myShirt, 'B');
//        System.out.println("Shirt color " + myShirt.colorCode);
//
//    }
//
//    public static void changeShirtColor(Shirt theShirt, char color) {
//        theShirt = new Shirt();
//        theShirt.colorCode = color;
//    }

//Calculator Test
int totalOne = Calculator.sum(2,3);
        System.out.println("The total is " + totalOne);
float totalTwo = Calculator.sum(15.99F,12.85F);
System.out.println("The total is " + totalTwo);
float totalThree = Calculator.sum(2,12.85F);
System.out.println("The total is " + totalThree);
}

class Shirt {

    public String description;
    public char colorCode;
    public double price;

    //Constructor - default
    public Shirt() {
        description = "description required";
        colorCode = 'U';
        price = 0.00;
    }

//     public Shirt(String description, char colorCode, double price){
//       this.description = description;
//       this.colorCode = colorCode ;
//       this.price = price;
//    }
//    
//    public void display() {
//        System.out.println("Item description:- " + description);
//        System.out.println("Color Code " + colorCode);
//        System.out.println("Item price " + price);
//    }
//    public void setFields(String description, char colorCode, double price) {
//        this.description = description;
//        this.colorCode = colorCode;
//        this.price = price;
//    }
    //Another Constructor
    public Shirt(String desc, String color, double price) {
        setFields(desc, price);
        setColor(color);

    }

    public void setColor(String theColor) {
        if (theColor.length() > 0) {
            colorCode = theColor.charAt(0);
        }
    }

    public void setFields(String description, double price) {
        this.description = description;
        this.price = price;
    }

}


class Calculator {

    public static int sum(int num1, int num2) {
        System.out.println("Method 1");
        return num1 + num2;
    }
    
public static float sum(float num1, float num2) {
        System.out.println("Method 2");
        return num1 + num2;
    }

public static float sum(int num1, float num2) {
        System.out.println("Method 3");
        return num1 + num2;
    }
}
}
