/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson8;

/**
 *
 * @author Lihle
 */
public class Lesson8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        
//        //        
//
//        calc.calculate(10, 5);
//        calc.printString();
//        System.out.println(calc.returnString());
//        System.out.println(calc.sum(100, 100));
//        System.out.println(calc.isGreater(30, 35));
//        
//Lesson8 lesson8 = new Lesson8();

//        int num1 = 1, num2 = 2;
//        int result = num1 + num2;
////        result = lesson8.sum(num1, num2);
//        result = sum(num1, num2);

        Item item1 = new Item();
        item1.setSize(ItemSizes.mMed);

    }

    public static void calculate(int x, double y) {
        System.out.println(x / y);
    }

    public static void printString() {
        System.out.println("Hello");
    }

    public static String returnString() {
        return "Hello there";
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static boolean isGreater(int x, int y) {
        return x > y;
    }
}

//class Calculator {
//
//    public static void calculate(int x, double y) {
//        System.out.println(x / y);
//    }
//
//    public static void printString() {
//        System.out.println("Hello");
//    }
//
//    public static String returnString() {
//        return "Hello there";
//    }
//
//    public static int sum(int x, int y) {
//        return x + y;
//    }
//
//    public static boolean isGreater(int x, int y) {
//        return x > y;
//    }
//
//}
class ItemSizes {

    static final String mSmall = "Men's Small";
    static final String mMed = "Men's Medium";
}
