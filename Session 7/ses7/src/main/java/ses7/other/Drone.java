package ses7.other;

public class Drone implements Flyable, Operable {

    public void fly(){
        System.out.println("Drone takes off.");
    }

    public void operate(){
        System.out.println("User takes control.");
    }
    
}
