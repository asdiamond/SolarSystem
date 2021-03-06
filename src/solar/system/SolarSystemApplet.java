package solar.system;

import noapplet.NoApplet;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class SolarSystemApplet extends NoApplet {
    private Dimension dim;
    private Sun sun;
    private Timer timer;

    @Override
    public void init() {
        dim = getSize();
        sun = Sun.getInstance();
        sun.setDim(dim);

        Planet venus = new Planet(sun, Color.red, 70, 10, 5);
        venus.addMoon(new Moon(venus, Color.gray,25, 30, 2));
        venus.addMoon(new Moon(venus, Color.blue, 25, 33, 3));
        sun.addPlanet(venus);
        sun.addPlanet(new Planet(sun, Color.green, 100, 15, 5));

        timer = new Timer(100, event -> repaint());
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, dim.width, dim.height);
        sun.draw(g);
    }

    @Override
    public void start() {
        timer.start();
    }

    @Override
    public void stop() {
        timer.stop();
    }

    public static void main(String[] args) {
        new SolarSystemApplet().run();
    }
}
