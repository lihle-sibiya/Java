package ex11_1_exercise;

//Exercise 11-1

import java.time.*;
import java.time.format.DateTimeFormatter;


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



public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
LocalDateTime orderDate;
        
	// Initialize the orderDate to the current date and time. Print it.
orderDate = LocaDateTime.now();
        System.out.println("Order date is: " + orderDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
String oDate = orderDate.format(DateTimeFormater.ISO__LOCAL_DATE);
        System.out.println("ISO DATE is: " + odate);

    }

    private static class LocaDateTime {

        private static LocalDateTime now() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public LocaDateTime() {
        }
    }

    private static class DateTimeFormater {

        private static DateTimeFormatter ISO__LOCAL_DATE;

        public DateTimeFormater() {
        }
    }
}