/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author Lihle
 */
public class Shirt {

    //Constructor - default
    public Shirt() {
        setColorCode('U');
    }

    //Other Constructor
    public Shirt(char colorCode) {
        setColorCode(colorCode);
    }

//Other Constructor
    public Shirt(char colorCode, double price) {
        this(colorCode);
        setPrice(price);
    }

    //Other Constructor
    public Shirt(String desc, char colorCode, double price) {
        this(colorCode, price);
        setDescription(desc);
    }

    private int shirtID = 0;
    private String description = "description required";
    private char colorCode = 'U';
    private double price = 0.0;

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char newCode) {
        if (newCode == ('R')) {
            colorCode = newCode;
            return;
        }
        if (newCode == ('G')) {
            colorCode = newCode;
            return;
        }
        if (newCode == ('B')) {
            colorCode = newCode;
            return;
        }
        System.out.println("Invalid color code");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt();
        System.out.println(shirt1.getColorCode());
        shirt1.setColorCode('Z');
        System.out.println(shirt1.getColorCode());
    }

}
