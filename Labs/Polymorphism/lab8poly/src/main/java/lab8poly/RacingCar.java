package lab8poly;

public class RacingCar extends Car {
    private String driver;
    private int turboFactor;
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public int getTurboFactor() {
        return turboFactor;
    }
    public void setTurboFactor(int turboFactor) {
        this.turboFactor = turboFactor;
    }
    public RacingCar(String model, int speed, String driver, int turboFactor) {
        super(model, speed);
        this.driver = driver;
        this.turboFactor = turboFactor;
    }
    @Override
    public void accelerate(int seconds){
        super.accelerate(seconds);
        speed = speed * turboFactor;
    }
    
}
