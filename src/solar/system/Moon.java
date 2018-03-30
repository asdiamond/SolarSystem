package solar.system;

import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class Moon extends Orbitable{

    public Moon(Plotable o,Color c, int distance, int speed, int radius){
        super(o, c, distance, speed, radius);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
    }

}
