package solar.system;

import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class Moon extends Orbitable{

    public Moon(Plotable o, int distance, int speed){
        super(o);
        this.color = Color.gray;
        this.distance = distance;
        this.speed = speed;
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
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
