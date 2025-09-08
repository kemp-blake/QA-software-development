package lab9abstract;

public class Lizard extends Amphibian{
    public Lizard(String name){
        super(name);
        super.animalType = AnimalType.AMPHIBIAN;
    }
    @Override
    public void makeNest() {
        System.out.println("Lizard made a nest out of twigs.");
    }
    
}
