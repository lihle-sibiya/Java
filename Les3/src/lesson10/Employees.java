/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author Lihle
 */
public class Employees {

    public String name1 = "Fred Smith";
    //public String name2 = "Fred Smith";
    public String name2 = "Sam Ku";
    int age = 50;

    public void areNamesEqual() {
        //if (name1 == name2) {
        if (name1.equals(name2)) {
            System.out.println("Same name");

        }
    }

    public static void main(String[] args) {
        Employees emps = new Employees();
        // emps.areNamesEqual();
        if (emps.age < 12 || emps.name1.startsWith("F")) {
            System.out.println("Found him");
        }
        



//        String name1 = "Fred Smith";
        //        String name2 = "Fred Smith";
        //        if (name1.equals(name2)) {
        //            System.out.println("They are equal");
        //        } else {
        //            System.out.println("They are not equal");
        //        }
        //new String method
        //        String name1 = new String("Fred Smith");
        //        String name2 = new String("Fred Smith");
        //        if (name1 == name2) {
        //            System.out.println("They are equal");
        //        } else {
        //            System.out.println("They are not equal");
        //        }
        {
            
        }
    }

}
