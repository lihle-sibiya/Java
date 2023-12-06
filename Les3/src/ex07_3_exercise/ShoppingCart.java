package ex07_3_exercise;

//Exercise 7-3
//
//1. Declare a long, using the L to indicate a long value.  Make it a 
//     very large number (in the billions).
//2. Declare and initialize a float and a char.
//3. Print the long variable with a suitable label.
//4. Assign the long to the int variable.  Correct the syntax error
//     by casting the long as an int.
//5. Print the int variable.  Note the change in value when you run it.
public class ShoppingCart {

    public static void main(String[] args) {
        int int1;

        //  Declare and initialize variables of type long, float, and char.
        long num1 = 20L;
        float num2 = 30.50F;
        char num3 = 'M';

        // Print the long variable.
        System.out.println(num1);
        // Assign the long to the int and print the int variable.
        int1 = (int)num1;
        System.out.println(int1);

    }
}
