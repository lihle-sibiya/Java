package ex14_1_exercise;

//Exercise 14-1
//
//In the Calculator class:
//1.  Change the divide method signature so that it throws 
//      an ArithmeticException.

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    // This method could throw an ArithmeticException
    public double divide(int x, int y) throws ArithmeticException {
        return x / y;
    }
}
