package lesson9;


public class Item {
    private double price = 15.50;

    public void setPrice(Customer cust) {
        if (cust.hasLoyaltyDiscount()) {
            price = price * .85;
        }
        System.out.println(price);
    }

}


