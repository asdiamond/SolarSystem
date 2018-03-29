package example;

import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class OrbitingBall implements Ball{
    private int radius = 20;
    private Color color = Color.green;
    private Dimension dim;
    private int distance;
    private int angle;

    public OrbitingBall(Dimension dim){
        this(dim, 50, 0);
    }

    public OrbitingBall(Dimension dim, int distance, int angle){
        this.dim = dim;
        this.distance = distance;
        this.angle = angle;
    }

    private int calX(){
        int center = dim.width / 2;
        return (int) (center + distance * Math.cos(Math.toRadians(angle)));
    }

    private int calY(){
        int center = dim.height / 2;
        return (int) (center + distance * Math.sin(Math.toRadians(angle)));
    }

    @Override
    public void draw(Graphics g) {
        angle = (angle + 10) % 360;

        g.setColor(color);
        g.fillOval(calX() - radius, calY() - radius, radius * 2, radius * 2);
    }
}
