package sfm;

public class Ball {
    public int x, y, w, h;
    private int dirX, dirY;

    public Ball(int x, int y, int w, int h, int dirX, int dirY) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirX = dirX;
        this.dirY = dirY;
    }

    public Ball(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    
    public void move() {
        int new_x = x + dirX;
        if(new_x > 0 && new_x < 300) {
            x = new_x;
        } else if (new_x < 0) { System.out.println("Invalid Movement.");}
        int new_y = y + dirY;
        if(new_y > 0 && new_y < 300) {
            y = new_y;
        } else { System.out.println("Invalid Movement.");}
        
    }
    
}
