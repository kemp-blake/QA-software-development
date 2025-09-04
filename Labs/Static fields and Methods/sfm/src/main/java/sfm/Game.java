package sfm;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {

    ArrayList<Shape> shapes = new ArrayList<>();

    /* x = x position
     * y = y position
     * w = width of the shape
     * h = height of the shape
     * dirX = speed in x direction
     * dirY = speed in y direction
     */

    Game() { // constructor class called everytime the game starts
 
        shapes.add(new Shape(200,100,10,10, ShapeType.RECTANGLE, Color.BLUE,5,5));// adding shapes to list
        shapes.add(new Shape(10,200,20,20, ShapeType.OVAL, Color.RED,10,5));// adding shapes to list
        shapes.add(new Shape(150,50,30,20, ShapeType.ROUNDRECTANGLE, Color.GREEN,5,10));// adding shapes to list
        // This is an array that is used to create the shapes, to edit the shapes change these values
 
        JFrame frame = new JFrame(); // creates a new frame
        this.setSize(400,400); // set size of window
        frame.add(this); // add size of window property to frame
        frame.pack(); // packs of 
        frame.setVisible(true); // sets frame to visible
        Timer t = new Timer(); // creates timer object
        TimerTask tt = new TimerTask() { // creates timertask object
            @Override // override 
            public void run() { // run method
                draw(); // to draw the window
            }
        };
        t.schedule(tt,0,50);// runs the schedule every 50 units (ms?) essentially redraws the window every unit

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) { // on window close
                t.cancel(); // cancel the timer
                tt.cancel(); // cancel the timer task (so it doesn't keep running after the window is closed)
                System.exit(0); // had to add this otherwise main would keep running even after closing the window so could hog resources.
            }
        });
    }

    public void draw() { // the draw method
        for(Shape shape : shapes) { // for each of the shapes in the shape array
            shape.move(); // move the shapes
        };
        this.repaint(); // repaint the window
    }

    public void paint(Graphics g) { // paint method
        g.drawRect(0,0,300,300); // draws boundary rectangle
        for(Shape shape : shapes) { // for each of the shapes in shape array
            g.setColor(shape.getColour());
            if (shape.getShapeType() == ShapeType.RECTANGLE) {
                g.drawRect(shape.x, shape.y, shape.w, shape.h);
            } else if (shape.getShapeType() == ShapeType.THREEDRECTANGLE){
                g.draw3DRect(shape.x, shape.y, shape.w, shape.h, true);
            } else if (shape.getShapeType() == ShapeType.ROUNDRECTANGLE){
                g.drawRoundRect(shape.x, shape.y, shape.w, shape.h, 5, 5);
            } else if (shape.getShapeType() == ShapeType.OVAL) {
                g.drawOval(shape.x, shape.y, shape.w, shape.h); // draw the shapes
            } else if (shape.getShapeType() == ShapeType.ARC) {
                g.drawArc(shape.x, shape.y, shape.w, shape.h, 90, 180);
            }
            
            shape.move(); // do the first movement
        };
    }
    
}
