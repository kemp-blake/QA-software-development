package ses10;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread daemon = new Thread(() -> {
            System.out.println("[DAEMON] This is from the Daemon after starting.");
            while (true) {
                try{
                    Thread.sleep(00);
                    System.out.println("[DAEMON] This is from the Daemon after waiting.");
                } catch (InterruptedException e) {
                    System.out.println("[DAEMON] [ERROR] - "+e);
                }
            }
        });

        daemon.setDaemon(true);
        daemon.start();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("This is from the T1 thread.");
            }
        };
        //implementation of runnable interface
        Runnable task = () -> System.out.println("This is from the T2 thread.");

        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println("[MAIN] - all threads finished");

        
    }
}