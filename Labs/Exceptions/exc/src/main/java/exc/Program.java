package exc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        Account account = new Account(1, 100, "Blake");
        try {
            account.withdraw(50);
            System.out.println(account.getDetails());
            account.withdraw(60);
            System.out.println(account.getDetails());
        } catch (IllegalArgumentException e) {
            System.out.println("Error was thrown: "+e.getMessage());
            try {
                log("[ERROR] "+e.getMessage());
            } catch (IOException er) {
                System.out.println("Error writing to log "+er.getMessage());
            }
        } catch (RuntimeException e) {
            System.out.println("Unknown Error: "+e.getMessage());
        } finally {
            account.close();
        }
        
    }
    private static void log(String msg) throws IOException{
        File file = new File(".\\Labs\\Exceptions\\exc\\src\\main\\java\\exc\\log.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.write(msg + "\r\n");
        br.close();
        fr.close();
    }
}