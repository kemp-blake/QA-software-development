package ses6;

public class Car extends Vehicle{

    public Car(String regPlate) {
        super(regPlate); // not all vehicles have a reg plate but this is just an example
    }
    @Override
    public void displaySpeed(){
        System.out.println("Car's speed: "+speed);
    }
    public void superDisplaySpeed(){
        super.displaySpeed();
    }

    public String getDetails(){
        return String.format("regPlate: %s%nSpeed: %d%n", regPlate, speed);
    }
}
