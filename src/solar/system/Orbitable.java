package solar.system;

import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public abstract class Orbitable implements Plotable{
    protected int radius = 8;
    protected Color color = Color.gray;
    protected Plotable plotable; //center of rotation, what is being orbited around
    protected int distance = 70;
    protected int angle = 0; //for polar coordinates
    protected int speed = 15;

    public Orbitable(Plotable p) {
        this.plotable = p;
    }

    public int calX(int center, int distance, int angle){
        return (int) (center + distance * Math.cos(Math.toRadians(angle)));
    }

    public int calY(int center, int distance, int angle){
        return (int) (center + distance * Math.sin(Math.toRadians(angle)));
    }

    public void draw(Graphics g){
        int x = calX(plotable.getX(), distance, angle);
        int y = calY(plotable.getY(), distance, angle);
        angle = (angle + speed) % 360;

        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
