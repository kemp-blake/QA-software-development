package lab9abstract;

abstract class Animal implements Movable {
    protected AnimalType animalType;
    protected String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Animal(String name) {
        this.name = name;
    }
    @Override
    public void move() {
        System.out.println("Animal moves.");
    }
    
}
