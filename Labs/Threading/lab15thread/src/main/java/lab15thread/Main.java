package lab15thread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        List<String> messages = new ArrayList<>().to;
        Thread a = new Thread(new Worker("a", ));
        Thread b = new Thread(new Worker("b", ));

        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("[MAIN] - Threads finished.");
    }
}