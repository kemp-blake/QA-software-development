package lab9abstract;

abstract class Amphibian extends Animal{
    public Amphibian(String name){
        super(name);
        super.animalType = AnimalType.AMPHIBIAN;
    }
    public abstract void makeNest();
}
