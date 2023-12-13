/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author Lihle
 */
public class Customer {

    private int ID;
    private boolean loyaltyDiscount;

    //Constructor
    public Customer(int ID) {
        this.ID = ID;

    }
    
    public void setLoyaltyPoints(boolean loyaltyPoints){
    this.loyaltyDiscount = loyaltyPoints;
    
    }

//Method for disocunt
    public boolean hasLoyaltyDiscount() {
        return loyaltyDiscount;
    }
}
