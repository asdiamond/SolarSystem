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

    public Planet(Plotable o, Color c, int distance, int speed, int radius){
        super(o, c, distance, speed, radius);
        moons = new ArrayList<>();
    }


    @Override
    public void draw(Graphics g) {
        for(Moon moon : moons){
            moon.draw(g);
        }
        super.draw(g);
    }

    public void addMoon(Moon m){
        moons.add(m);
    }

}
