package lab9abstract;

public class Duck extends Bird {
    public Duck(String name) {
        super(name);
    }
    @Override
    public void makeNest() {
        System.out.println("Duck made a nest out of sticks.");
    }
    
}
