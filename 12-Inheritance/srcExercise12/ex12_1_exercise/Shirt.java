/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_1_exercise;

/**
 *
 * @author dmtshoeni
 */
public class Shirt extends Item {
    private char size;
    private char colourCode;
    
    public Shirt (double price, char size, char colorCode)
    {
    super ("Shirt", price);
    this.size =size;
    this.colourCode =colorCode;
    }
}
