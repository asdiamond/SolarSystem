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
        super(o);
        moons = new ArrayList<>();
    }

    public Planet(Plotable o, Color c, int distance, int speed){
        this(o);
        this.color = c;
        this.distance = distance;
        this.speed = speed;
    }


    @Override
    public void draw(Graphics g) {
        super.draw(g);
        for(Moon moon : moons){
            moon.draw(g);
        }
    }

    public void addMoon(Moon m){
        moons.add(m);
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
