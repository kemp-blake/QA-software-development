package ses7.other;

public class App {
    private final Logger logger;
    public App(Logger logger){
        this.logger = logger;
    }
    public void run() {
        logger.log("Application is starting...");
    }
}
