package ex11_1_exercise;

//Exercise 11-1
//
//1. Declare a LocalDateTime object to hold the order date.
//2. Initialze the object to the current date and time using the 
//     now static method of the class.
//3. Print the orderDate object with a suitable label.  
//4. Format the orderDate, using the ISO_LOCAL_DATE static constant 
//     field of the DateTimeFormatter class.
//5. Add the necessary package imports (hint: java.time.<classname>)
//6. Print the formatted orderDate with a suitable label 
//7. Run your code.
// import statements here:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShoppingCart {

    public static void main(String[] args) {
        // Declare a LocalDateTime object, orderDate

        LocalDateTime orderDate = LocalDateTime.now();

        // Initialize the orderDate to the current date and time. Print it.
        String formatOrderDate = orderDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Order date fomatted is " + formatOrderDate);

        // Format orderDate using ISO_LOCAL_DATE; Print it.
        String sDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("ISO local date " + sDate);

    }
}
