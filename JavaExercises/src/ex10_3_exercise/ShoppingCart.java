
package ex10_3_exercise;

//Exercise 10-3
//
//2. Run the ShoppingCart class again to test your logic.

public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.CORP);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
