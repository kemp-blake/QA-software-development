package lab8poly;

public class Car {
    protected String model;
    protected int speed;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
    
    public void accelerate(int seconds){
        speed = speed + 5 * seconds;

    }
    public void getToSixty(){
        speed = 60;

    }
}
