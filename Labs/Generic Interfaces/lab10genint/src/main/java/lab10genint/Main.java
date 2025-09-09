package lab10genint;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account(100, "Bob", 1000));
        accounts.add(new Account(500, "Linda", 3000));
        accounts.add(new Account(300, "David", 2000));
        Collections.sort(accounts);

        for (Account account : accounts) {
            System.out.println(account.getDetails());
        }
    }

}