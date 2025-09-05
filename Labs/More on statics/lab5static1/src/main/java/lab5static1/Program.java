package lab5static1;

public class Program {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Vehicle(20, 1),
            new Vehicle(40,2),
            new Vehicle(34, 3),
            new Vehicle(23, 4),
            new Vehicle(64, 5),
            new Vehicle(123, 6),
            new Vehicle(54, 7),
            new Vehicle(75, 8),
            new Vehicle(55, 9),
            new Vehicle(12, 10),
        };
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getDetails());
        }
    }
}