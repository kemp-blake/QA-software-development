package lab8poly;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford Fiesta", 80));
        cars.add(new Car("Toyota Yaris", 60));
        cars.add(new RacingCar("Lamborgini", 120, "John Smith", 2));
        cars.add(new RacingCar("Ferrari", 120, "Jane Smith", 3));

        processCars(cars);
    }

    public static void processCars(ArrayList<Car> cars) {
        for(Car car : cars){
            car.getToSixty();
            car.accelerate(2);
            if(car instanceof RacingCar){
                RacingCar toracingcar = (RacingCar) car;
                System.out.printf("Model: %s,%nSpeed: %d,%nDriver: %s%n%n%n%n", toracingcar.getModel(), toracingcar.getSpeed(), toracingcar.getDriver());
            } else if (car instanceof Car) {
                System.out.printf("Model: %s,%nSpeed: %d,%n%n%n%n", car.getModel(), car.getSpeed());
            } else {
                System.out.println("[ERROR] Unexpected type.");
            }
            
        }
    }
}