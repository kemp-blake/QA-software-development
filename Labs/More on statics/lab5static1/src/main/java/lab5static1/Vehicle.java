package lab5static1;

public class Vehicle {
    int speed;
    int lane;
    int distanceTravelled;
    RegistrationPlate registrationPlate = RegistrationPlateFactory.getNextRegistrationPlate();

    public Vehicle(int speed, int lane) {
        this.speed = speed;
        this.lane = lane;
    }
    public void accelerate(int amount) {
        if (amount < 200) {
            speed = speed + amount;
            distanceTravelled = distanceTravelled + amount;
        } else {System.out.println("Max acceleration is 200.");}

    }
    public void brake(int amount) {
        speed = speed - amount;
    }
    public String getDetails() {
        return String.format("Speed: %d%nLane: %d%nDistance Travelled: %d%nPlate: %s%n", speed, lane, distanceTravelled, registrationPlate.getPlate());
    }
}
