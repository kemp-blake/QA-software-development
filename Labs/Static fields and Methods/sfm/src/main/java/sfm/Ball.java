package sfm;

public class Ball {// create object ball
    public int x, y, w, h; // size and width
    private int dirX, dirY; // direction and speed

    public Ball(int x, int y, int w, int h, int dirX, int dirY) { // constructor 1
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirX = dirX;
        this.dirY = dirY;
    }

    public Ball(int x, int y, int w, int h) { // constructor 2
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    
    public void move() { // move function
        int new_x = x + dirX; // new x position = current position plus x scalar (speed)
        if(new_x > 0 && new_x + w < 300) { // if movement would put it inside the bounds
            x = new_x; // set x to new x position
        } else if (new_x <= 0) {  // if new x position would put it below 0
            dirX = -dirX; // swap the direction
            x = 0; // set position to 0
        } else if (new_x + w >= 300){// if new x position plus width (x is the upper-left point) is greater than boundary
            dirX = -dirX; // swap direction
            x = 300 - w; // set to boundary - width
        }
        int new_y = y + dirY; // same as above but for y
        if(new_y > 0 && new_y + h< 300) {
            y = new_y;
        } else if (new_y <= 0) { 
            dirY = -dirY;
            y = 0;
        } else if (new_y + h >= 300){
            dirY = -dirY;
            y = 300 - h;
        }
        
    }
    
}
