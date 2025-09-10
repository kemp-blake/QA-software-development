package ses8.Factories.AbstractFactory;

public class Sake implements Drink {
    @Override
    public void serve(){
        System.out.println("Serving Sake...");
    }
}
