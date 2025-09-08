package ses6;

public class Vehicle {
    protected int speed;
    protected String regPlate;

    public void displaySpeed() {
        System.out.println("Speed: "+ speed);
    }

    public Vehicle(String regPlate) {
        this.regPlate = regPlate;
    }
}
