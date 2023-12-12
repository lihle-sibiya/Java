/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

import lesson12.*;

/**
 *
 * @author Lihle
 */
public class Shirt extends Clothing {

    private char fit = 'U';

    public Shirt(int itemID, String description, char colorCode, double price,
            char fit) {
        super(itemID, description, colorCode, price);
        this.fit = fit;
    }

    public void display() {
        super.display();
        System.out.println("Fit " + fit);
    }

    /**
     * @return the fit
     */

    public char getFit() {
        return fit;
    }

    /**
     * @param fit the fit to set
     */
    public void setFit(char fit) {
        this.fit = fit;
    }

    @Override
    public String toString() {
        return ("This shirt is a great fit " + fit + "\nGender " + gender);
    }
    
    @Override
    public String doReturn () {
    return ("Shirt is");
    }
    

}
