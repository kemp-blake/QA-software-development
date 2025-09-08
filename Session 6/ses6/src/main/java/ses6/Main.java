package ses6;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("AK55 LSP");
        car.speed = 100;

        car.displaySpeed();
        car.superDisplaySpeed();
        System.out.println(car.getDetails());

        //implicit casting - up casting, going up in inheritance
        Vehicle myCar = new Car("RP49 KBN");
        // casting a car object as a vehicle
        // Is a car but is referenced as a vehicle, the reference determines behaviour
        myCar.displaySpeed(); // since this is overriden it displays the car's version
        //myCar.superDisplaySpeed(); // This gives an error since it's looking in Vehicle for .superDisplaySpeed().

        //explicit casting - downcasting

        Car myCarType = (Car) myCar;

        myCarType.superDisplaySpeed(); // can now call Car's methods
    }
}