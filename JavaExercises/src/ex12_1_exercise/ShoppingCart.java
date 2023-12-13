package ex12_1_exercise;

//Exercise 12-1
//
//In the ShoppingCart class, 
//6.  Declare and instantiate a Shirt object, using the 3 arg constructor.
//7.  Call the display() method on the object reference. 
//      Where is the display method coded?

public class ShoppingCart {
    public static void main(String[] args){

	// instantiate a Shirt object and call display() on the object reference
 Shirt shirt = new Shirt(99.99, 'S', 'B');
         shirt.display();
        
    }
}
