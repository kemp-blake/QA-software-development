package exc;

public class Account {
    int id;
    double balance;
    String owner;
    public Account(int id, double balance, String owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    
}
