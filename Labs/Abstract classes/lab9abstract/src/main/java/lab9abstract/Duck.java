package lab9abstract;

public class Duck extends Bird implements Flyable, Swimmable {
    public Duck(String name) {
        super(name);
    }
    @Override
    public void makeNest() {
        System.out.println("Duck made a nest out of sticks.");
    }
    @Override
    public void fly() {
        System.out.println("Duck Flies.");
    }
    @Override
    public void swim() {
        System.out.println("Duck Swims.");
    }
    
}
