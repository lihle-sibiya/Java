/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

/**
 *
 * @author Lihle
 */
public class Utils {

    public void doThis() {
        System.out.println("Arrived in doThis()");
        try {
            doThat();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(
                "back in doThis()");
    }

    public void doThat() throws Exception {
        System.out.println("in doThat()");
        throw new Exception();
    }

    public static void main(String[] args) {
        Utils u = new Utils();
        u.doThis();

    }

}
