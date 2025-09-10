package ses8.Factories.AbstractFactory;

public class Ramen implements MainCourse {
    @Override
    public void serve(){
        System.out.println("Serving Ramen...");
    }
}
