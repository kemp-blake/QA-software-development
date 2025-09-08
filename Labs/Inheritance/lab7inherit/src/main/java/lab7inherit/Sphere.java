package lab7inherit;
import java.awt.Color;
import java.awt.Point;

public class Sphere extends Circle {
    public double getVolume() {
        return 4/3 * Math.PI * Math.pow(radius, 3);
    }
    public Sphere(Color colour, Point position, double radius){
        super(colour, position, radius);
    }
    
}
