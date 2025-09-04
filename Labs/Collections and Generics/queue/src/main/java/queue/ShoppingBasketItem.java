package queue;

public class ShoppingBasketItem {
    private String productName;
    private int quantity;
    private double price;

    public String getDetails(){
        return String.format("Product Name: %s,%nQuantity: %d,%nPrice: %.2f%n", productName, quantity, price);
    }

    public ShoppingBasketItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    
}
