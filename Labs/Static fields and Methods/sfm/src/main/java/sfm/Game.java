package sfm;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
    Ball[] balls = {
        new Ball(200,100,10,10,5,5),
        new Ball(10,200,20,20,10,5),
        new Ball(150,50,30,20,5,10)
    }; // This is an array that is used to create the balls, to edit the balls change these values

    /* x = x position
     * y = y position
     * w = width of the ball
     * h = height of the ball
     * dirX = speed in x direction
     * dirY = speed in y direction
     */

    Game() {
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
        for(Ball ball : balls) { // for each of the balls in the ball array
            ball.move(); // move the balls
        };
        this.repaint(); // repaint the window
    }

    public void paint(Graphics g) { // paint method
        g.drawRect(0,0,300,300); // draws boundary rectangle
        for(Ball ball : balls) { // for each of the balls in ball array
            g.drawOval(ball.x, ball.y, ball.w, ball.h); // draw the balls
            ball.move(); // do the first movement
        };
    }
    
}
