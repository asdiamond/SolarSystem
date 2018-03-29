package solar.system;

import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public abstract class Orbitable {
    protected int radius;
    protected Color color;
    protected int center; //center of rotation
    protected int distance;
    protected int angle; //for polar coordinates
    protected int speed;

    public Orbitable(Color color, int center, int distance, int radius, int speed) {
        this.color = color;
        angle = 0;
        this.center = center;
        this.distance = distance;
        this.radius = radius;
        this.speed = speed;
    }

    public int calX(int center, int distance, int angle){
        return (int) (center + distance + Math.cos(Math.toRadians(angle)));
    }
    public int calY(int center, int distance, int angle){
        return (int) (center + distance + Math.sin(Math.toRadians(angle)));
    }

    public void draw(Graphics g){
        int x = calX(center, distance, angle);
        int y = calY(center, distance, angle);
        angle = (angle + speed) % 360;

        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
