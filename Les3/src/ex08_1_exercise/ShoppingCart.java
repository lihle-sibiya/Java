package ex08_1_exercise;

//Exercise 8-1
//
//In the ShoppingCart class:
//2. Call the setColor method on item1.  If it returns true,
//     print out item1.color.  If it returns false, print an
//     invalid color message.
//3. Test the method with both a valid color and an invalid one.
public class ShoppingCart {

    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the setColor method on item1. Print the new color value from
        item1.color = 'G';
//   item1 if the method returns true.  Otherwise print an "invalid color"
        if (item1.setColor('G')) {
            System.out.println("The color is " + item1.color);
        } //   message.
        else {
            System.out.println("This is an invalid color.");
        }

        // Test the class, using both valid and invalid colors.
    }
}
