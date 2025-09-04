package sfm;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
    Game() {
        JFrame frame = new JFrame();
        this.setSize(400,400);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };
        t.schedule(tt,0,50);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                t.cancel();
                tt.cancel();
            }
        });
    }

    public void draw() {
        this.repaint();
    }

    public void paint(Graphics g) {
        g.drawRect(0,0,300,300);
    }
    
}
