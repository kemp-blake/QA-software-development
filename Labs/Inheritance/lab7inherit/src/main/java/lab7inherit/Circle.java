package lab7inherit;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }
    public String getCharacteristics() {
        return String.format("Colour: %s%nPosition: %s%radius: %f%n", colour.toString(), position.toString(), radius);
    }

    public Circle(Color colour, Point position, double radius) {
        super(colour, position);
        this.radius = radius;
    }
    
}
