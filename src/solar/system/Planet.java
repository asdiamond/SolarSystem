package solar.system;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class Planet extends Orbitable{

    private Collection<Moon> moons;

    public Planet(Plotable o){
        super(o.getX(), o.getY());
        moons = new ArrayList<>();
    }


    @Override
    public void draw(Graphics g) {
        super.draw(g);
        for(Moon moon : moons){
            moon.draw(g);
        }
    }

    @Override
    public int getX() {
        return this.centerX;
    }

    @Override
    public int getY() {
        return this.centerY;
    }
}
