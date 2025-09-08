package lab9abstract;

abstract class Bird extends Animal{
    public Bird(String name){
        super(name);
        super.animalType = AnimalType.BIRD;
    }
    public abstract void makeNest();
    
}
