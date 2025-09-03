package lab4oop;

public class Account {
    private int id;
    private String owner;
    private double balance;

    void Deposit(double amount) {
        if(amount > 0){
            balance = balance + amount;
        } else {System.out.println("Transaction failed - Invalid amount");}
        
    };

    void Withdraw(double amount) {
        if(amount > 0) {
            if(amount <= balance){
                balance = balance - amount;
            } else {System.out.println("Transaction failed - Not enough money.");}
        } else {System.out.println("Transaction failed - Invalid amount");}

    };

    public Account(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public String getDetails() {
        return String.format("Account ID: %d%nOwner: %s%nBalance: %f%n",id, owner, balance);
    }

    public void addInterest() {
        balance = balance + (balance * 0.025);
    }
    
}
