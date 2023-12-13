package ex09_2_exercise;

//Exercise 9-2
//
//In the ShoppingCart class:
//2. Declare, instantiate, and initialize a new Customer object
//    by calling the custom constructor.  
//3. Test it by printing the customer object name 
//    (call getName method).
public class ShoppingCart {

    public static void main(String args[]) {
        // Declare, instantiate, and initialize a Customer object
        Customer cust1 = new Customer("Owethu", "1234");

        // Print the customer object name
        System.out.println("The name of the customer is " + cust1.getName());
    }
}
