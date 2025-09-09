package lab9abstract;

public class Fish extends Animal implements Swimmable{
    public Fish(String name){
        super(name);
        super.animalType = AnimalType.FISH;
    }
    @Override
    public void swim(){
        System.out.println("Fish just keeps swimming.");
    }
    
}
