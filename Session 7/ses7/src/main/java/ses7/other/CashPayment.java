package ses7.other;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(int amount){
        System.out.println("Paid "+amount+ " with cash.");
    };
    
}
