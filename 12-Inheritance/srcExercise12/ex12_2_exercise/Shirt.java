//In the Shirt class:
//1.  Override the display method and do the following:
//	- Call the superclass's display method.
//	- Print the size field and the colorCode field.  
//2.  Run the ShoppingCart class.  Do you see a different 
//      display than you did in the previous exercise?
package ex12_2_exercise;

public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    } 
    
    // Override display() in the superclass to also show size and colorCode.
    //   Avoid duplicating code.
    public void display()
    {
    super.display();
        System.out.println("Size "+ size);
         System.out.println("Colour code "+ colorCode);
    }
}
