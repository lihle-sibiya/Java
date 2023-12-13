
package ex10_2_exercise;

//Exercise 10-2
//
//In the ShoppingCart class:
//3. Examine the code.  This class needs no modification.
//4. Run the ShoppingCart to test the order.calcDiscount method. 


public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.CORP);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
