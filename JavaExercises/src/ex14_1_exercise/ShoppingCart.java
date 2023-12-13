package ex14_1_exercise;

//Exercise 14-1
//
//In the ShoppingCart class:
//2.  Surround the code that calls the divide method
//      with a try / catch block.  Handle the exception 
//      object by printing it to the console.
//3.  Run the ShoppingCart to view the outcome.

public class ShoppingCart {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);

        // Add exception handling to catch ArithmeticException
        try {
            double divResult = calc.divide(15, 1);
            System.out.println("Division Result: " + divResult);
        } catch (ArithmeticException e) {
            System.out.println("error being thrown" + e);
        }

    }
}
