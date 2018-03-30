package solar.system;

import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public abstract class Orbitable implements Plotable{
    protected int radius;
    protected Color color;
    protected Plotable plotable; //center of rotation, what is being orbited around
    protected int distance;
    protected int angle = 0; //for polar coordinates
    protected int speed;


    public Orbitable(Plotable o, Color c, int distance, int speed, int radius){
        this.plotable = o;
        this.distance = distance;
        this.speed = speed;
        this.radius = radius;
        this.color = c;
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

        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        angle = (angle + speed) % 360;
    }

    @Override
    public int getX() {
        return calX(plotable.getX(), distance, angle);
    }

    @Override
    public int getY() {
        return calY(plotable.getY(), distance, angle);
    }
}
