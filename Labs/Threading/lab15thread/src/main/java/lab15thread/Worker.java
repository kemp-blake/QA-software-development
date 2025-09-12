package lab15thread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Worker implements Runnable {
    List<String> messages;
    String label;

    Worker(String label, List<String> messages){
        this.messages = messages;
        this.label = label;
    }

    @Override
    public void run(){
        Path filepath = Paths.get("Labs\\Threading\\lab15thread\\src\\main\\resources\\shared_file.txt");
        try{
            Files.writeString(filepath, "[THREAD "+label+"] "+message, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("[WORKER] [ERROR] - "+e);
        }
        

    }
    
}
