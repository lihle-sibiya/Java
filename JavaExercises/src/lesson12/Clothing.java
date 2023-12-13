/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author Lihle
 */
public class Clothing {
    private int itemID =0;
    private String desc = "requires description";
    private char colourCode ='U';
    private double price = 0.0;   
    
    
    public Clothing (int ItemID, String desc, char color,double price)
{
this.itemID= ItemID;
this.desc=desc;
this.colourCode =color;
this.price=price;

}
    public void display (){
        System.out.println("item id "+ getItemID());
        System.out.println("item description "+ getDesc());
        System.out.println("item price "+ getPrice());
        System.out.println("color code "+ getColourCode());
    }

    /**
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the colourCode
     */
    public char getColourCode() {
        return colourCode;
    }

    /**
     * @param colourCode the colourCode to set
     */
    public void setColourCode(char colourCode) {
        this.colourCode = colourCode;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}