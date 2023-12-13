package ex08_2_exercise;

//Exercise 8-2

//In the ShoppingCart class:
//3. Call the 3-arg setItemFields method and then call item1.displayItem()
//4. Call the 4-arg setItemFields method, checking the return value.  
//     If the return value < 0, print an invalid color code message,
//     otherwise call displayItem.

public class ShoppingCart {

    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Dress", 1, 150.99);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.  
        int returnValue = item1.setItemFields("Jersey", 2, 100.25, 'P');
        if (returnValue < 0) {
            System.out.println("Invalid color code");
        } else {
            item1.displayItem();
        }

        // Test your code for both valid and invalid values
    }
}
