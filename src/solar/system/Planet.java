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

    public Planet(){
        //center as zero
        this(10, Color.gray, 0, 10, new ArrayList<>());
    }

    public Planet(int center){
        this(10, Color.gray, center, 10, new ArrayList<>());
    }

    public Planet(int radius, Color color, int center, int distance, Collection<Moon> moons){
        super(color, center, distance, radius, 20);
        this.moons = moons;
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        for(Moon moon : moons){
            moon.draw(g);
        }
    }
}
