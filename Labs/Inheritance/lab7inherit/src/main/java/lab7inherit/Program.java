package lab7inherit;
import java.awt.Point;
import java.awt.Color;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(Color.BLUE, new Point(3, 7), 4, 4);
        System.out.println(rect1.getCharacteristics());

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(Color.BLUE, new Point(3, 7), 4, 4));
        shapes.add(new Circle(Color.RED, new Point(5, 5), 7));
        shapes.add(new Sphere(Color.ORANGE, new Point(2, 3), 3));
        shapes.add(new Rectangle(Color.GREEN, new Point(1, 1), 2, 6));
        
        for(Shape shape : shapes){
            System.out.printf("Colour: %s%nPosition: %s%n", shape.getColour(), shape.getPosition());
        }
        
    }
}