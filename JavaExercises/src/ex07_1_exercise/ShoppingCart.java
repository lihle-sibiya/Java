package ex07_1_exercise;

//Exercise 7-1
//
//1. Use the indexOf method to get the index for the space character (" ")
//     within custName.  Assign it to spaceIdx.
//2. Use the substring method and the spaceIdx to get the first name
//     portion of custName.  Assign it to firstName.  Print firstName.
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName. 
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);

        // Use the substring method parse out the first name and print it.
        System.out.println(firstName);

    }
}
