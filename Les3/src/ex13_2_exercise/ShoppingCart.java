package ex13_2_exercise;

//Exercise 13-2
//
//(The Item, Shirt, and Trousers classes are provided.  Item and Shirt are very similar to exercise 12-3)
//
//In the ShoppingCart class:
//1.  Examine the code.  As you can see, the items list has been initialized with
//       2 shirts and 2 pairs of trousers.
//2.  In the removeItemFromCart method, use the removeIf method 
//       (which takes a Predicate lambda type) to remove all items 
//        whose description matches the desc argument.
//3.  Print the items list.  Hint: the toString method in the Item class has 
//        been overloaded to return the item description.
//4.  Call the removeItemFromCart method from the main method.  Try different
//        description values, including ones that will return false.
//5.  Test your code.
        
import java.util.ArrayList;
import java.util.function.Predicate;

public class ShoppingCart {
    ArrayList<Item> items = new ArrayList();
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.fillCart();
        cart.removeItemFromCart("Shirt");
        //Exercise
        System.out.println(cart.items);
    }
    
    public void fillCart(){
        items.add(new Shirt(40.95,'M','R'));
        items.add(new Shirt(32.99,'M','Y'));
        items.add(new Trousers(59.99,34,'B',"Relaxed",'M'));
        items.add(new Trousers(75.50,8,'G',"Skinny",'F'));
    }
    
    public void removeItemFromCart(String desc){
        // remove all Trousers from the items list, then print out the list
        items.removeIf(i-> i.getDesc().equals(desc));
    }
    
}
