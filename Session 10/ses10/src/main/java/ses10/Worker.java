package ses10;

public class Worker implements Runnable {
    String label;
    int times;

    Worker(String label, int times){
        this.label = label;
        this.times = times;
    }

    @Override
    public void run(){
        for (int x  = 0; x < times; x++){
            System.out.println("[Thread "+label+"] - This is run "+ (x+1) +"/"+times);
        }
    }

    static void mySleep(long ms) {
        try{
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("[Worker] [ERROR] - "+ e);
        }
    }
    
}
