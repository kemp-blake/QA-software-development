package lab7inherit;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape {
    double sideA;
    double sideB;
    public double getArea() {
        return sideA * sideB;
    }
    public double getCircumference() {
        return (sideA*2) + (sideB*2);
    }
    public String getCharacteristics() {
        return String.format("Colour: %s%nPosition: %s%nSide A: %f%nSide B: %f%n", colour.toString(), position.toString(), sideA, sideB);
    }
    public Rectangle(Color colour, Point position, double sideA, double sideB) {
        super(colour, position);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    
    
}
