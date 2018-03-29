package solar.system;

import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class Moon extends Orbitable{

    public Moon(){
        this(Color.gray, 0, 10, 10);
    }

    public Moon(Color color, int center, int distance, int radius) {
        super(color, center, distance, radius, 20);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
    }
}
