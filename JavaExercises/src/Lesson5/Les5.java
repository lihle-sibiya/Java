/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson5;

/**
 *
 * @author Lihle
 */
public class Les5 {

    public static void main(String[] args) {
//        String[] names = {"George", "Jill", "Xinyi", "Ravi"};
//   for (String name: names){
//       System.out.println("Name is " + name);
//   }

        int passmark = 12;
        boolean passed = false;
        int[] scores = {40,4, 6, 2, 8, 12, 35, 9};

        for (int unitScore : scores) {
            if (unitScore >= 12) {
                passed = true;
                break;
            }
        }
        System.out.println("At least one passed? " +passed);

    }

}
