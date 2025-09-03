package lab5static1;

public class Program {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Vehicle(20, 1),
            new Vehicle(40,2),
            new Vehicle(34, 3)
        };
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getDetails());
        }
    }
}