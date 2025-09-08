package lab7inherit;
import java.awt.Point;
import java.awt.Color;

abstract class Shape {
    protected Color colour;
    protected Point position;
    public Color getColour() {
        return colour;
    }
    public Point getPosition() {
        return position;
    }
    public void setColour(Color colour) {
        this.colour = colour;
    }
    public void setPosition(Point position) {
        this.position = position;
    }
    public Shape(Color colour, Point position) {
        this.colour = colour;
        this.position = position;
    }

    
    
    
}
