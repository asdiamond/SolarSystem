package solar.system;

import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class Moon extends Orbitable{


    public Moon(Plotable o){
        super(o.getX(), o.getY());
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
    }

    @Override
    public int getX() {
        return calX(centerX, distance, angle);
    }

    @Override
    public int getY() {
        return calY(centerY, distance, angle);
    }
}
