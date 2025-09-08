package lab9abstract;

public class Fish extends Animal {
    public Fish(String name){
        super(name);
        super.animalType = AnimalType.FISH;
    }
    public void swim(){
        System.out.println("Fish just keeps swimming.");
    }
    
}
