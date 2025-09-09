package lab9abstract;

public class Penguin extends Bird implements Swimmable{
    public Penguin(String name){
        super(name);
    }
    @Override
    public void makeNest(){
        System.out.println("Penguin made a nest out of snow.");
    }
    @Override
    public void swim() {
        System.out.println("Penguin Swims");
    }
    
}
