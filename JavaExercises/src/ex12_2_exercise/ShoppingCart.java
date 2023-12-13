package ex12_2_exercise;

//Exercise 12-2
//
//2.  Run the ShoppingCart class.  Do you see a different 
//      display than you did in the previous exercise?

public class ShoppingCart {
    public static void main(String[] args){
        // instantiate a Shirt object and call the display() method
        Shirt shirt = new Shirt(25.99, 'M', 'P');
        shirt.display();
        
    }
}
