package ses7.other;

public class ShoppingCart {
    private PaymentStrategy strategy;
    public ShoppingCart(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void checkout(int amount){
        strategy.pay(amount);
    }
}
