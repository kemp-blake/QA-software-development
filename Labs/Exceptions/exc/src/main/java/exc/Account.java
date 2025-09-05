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
    public void withdraw(double amount) throws IllegalArgumentException{
        if (balance - amount >= 0) {
            balance = balance - amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void close(){
        System.out.println("Account [ID] "+id+" is closed.");
    }
    public String getDetails(){
        return String.format("ID: %d,%nBalance: %.2f,%nOwner: %s%n", id, balance, owner);
    }
    
}
