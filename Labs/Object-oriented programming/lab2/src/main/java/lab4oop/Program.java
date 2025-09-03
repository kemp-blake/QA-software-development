package lab4oop;

public class Program {
    public static void main(String[] args) {

        Account[] accounts = {new Account(1, "Blake", 1000), new Account(2, "test2", 2000), new Account(3, "test3", 3000)};
        for(Account account : accounts) {
            System.out.println(account.getDetails());
        }
        Account intaccount = new Account(4, "testint", 100);
        intaccount.addInterest();
        System.out.println(intaccount.getDetails());

        Account partnerAccount = intaccount;
        partnerAccount.addInterest();
        System.out.println(intaccount.getDetails());

        processAccount(intaccount);
        System.out.println(intaccount.getDetails());

        int k = 100;
        incInt(k);
        System.out.println(k);
    }
    static void processAccount(Account acc){
        acc.addInterest();
    }
    private static void incInt(int x){
        x++;
    }
}

