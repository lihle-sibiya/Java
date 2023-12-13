/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Lihle
 */
public class MultipleExceptionsTest {

    public static void main(String[] args) {
        try {
            createFile();
        } catch (IOException io) {
            System.out.println("input output exception:" + io);
        } catch (IllegalArgumentException iae) {
            System.out.println("Illegal argument exception" + iae);
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }

    public static void createFile() throws IOException {
        File testF = new File("c:/notWriteableDir");
        File tempF = testF.createTempFile("tuu", null, testF);
        System.out.println("Temp filename: " + tempF.getPath());
        int myInt[] = new int[5];
        myInt[5] = 25;
    }

}
