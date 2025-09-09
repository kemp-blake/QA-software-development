package ses7.other;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount){
        System.out.println("Paid "+amount+ " with credit card.");
    };
    
}
