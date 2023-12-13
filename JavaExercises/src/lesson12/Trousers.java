/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

import lesson12.Clothing;

/**
 *
 * @author Lihle
 */
public class Trousers extends Clothing {
     private char fit;
    private char gender;
    public Trousers(int ItemID, String desc, char colorCode,double price,char fit, char gender)
    {
    super(ItemID, desc, colorCode, price);
    this.fit =fit;
    this.gender = gender;
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

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
}
