/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

import java.util.ArrayList;

/**
 *
 * 
 * @author dmtshoeni
 */


public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> name;
        name = new ArrayList();
        
        name.add ("Jammie");
        name.add ("Gustav");
        name.add ("Alisa");
        name.add ("Jose");
        name.add ("Phrashant");
        
        System.out.println(name);
        name.remove(0);
        
        System.out.println(name);
        name.remove(name.size() -1);
        
        System.out.println(name);
        name.remove("Gustav");
        
    }
}
        