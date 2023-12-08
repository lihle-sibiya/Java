/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author Lihle
 */
public class MonthsTest {

    public static void main(String[] args) {
        int month = 10;
        boolean leapYear = true;

        //If Statement
//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//            System.out.println("31 days in month");
//        } else if (month == 2) {
//            if (!leapYear) {
//                System.out.println("28 days in month");
//            }
//                else {
//                       System.out.println("29 days in month"); 
//                        }
//
//            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//                System.out.println("30 days in month");
//            } else {
//                System.out.println("Invalid month");
//            }
        //Switch statement
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in month");
                break;
            case 2:
                if (!leapYear) {
                    System.out.println("28 days in month");
                } else {
                    System.out.println("29 days in month");
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in month");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
