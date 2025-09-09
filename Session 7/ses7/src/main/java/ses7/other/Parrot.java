package ses7.other;

public class Parrot implements Bird, Animal {
    @Override
    public void eat(){
        System.out.println("Parrot is eating.");
    }
    @Override
    public void speak(){
        System.out.println("Parrot says hello.");
    }
    @Override
    public void fly(){
        System.out.println("Parrot takes off.");
    }
    
}
