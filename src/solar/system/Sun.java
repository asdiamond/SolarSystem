package solar.system;

import java.awt.*;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class Sun implements Plotable{

    private Collection<Planet> planets;
    private Color color = Color.yellow;
    private Dimension dim;
    private int x, y;
    private int radius = 20;

    private static Sun ourInstance = new Sun();

    public static Sun getInstance() {
        return ourInstance;
    }

    private Sun() {
        planets = new LinkedList<>();
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    //maybe refactor?
    public void draw(Graphics g) {
        this.x = dim.width / 2;
        this.y = dim.height / 2;

        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);

        for (Planet planet : planets) {
            planet.draw(g);
        }
    }

    public void addPlanet(Planet planet){
        planets.add(planet);
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }
}
