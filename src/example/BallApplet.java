package example;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;


/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class BallApplet extends Applet{
    protected Dimension dim;
    private Timer timer;

    private int x, y;
    private int dx = 2, dy = 4;
    private int radius = 20;
    private Color color = Color.GREEN;

    @Override
    public void init() {
        dim = getSize();
        x = dim.width / 2;
        y = dim.height / 2;

        timer = new Timer(100, event -> repaint());
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, dim.width, dim.height);
        if(x < radius || x > dim.width - radius) dx = -dx;
        if(y < radius || y > dim.height - radius) dy = -dy;

        x += dx;
        y += dy;

        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public void start() {
        timer.start();
    }

    @Override
    public void stop() {
        timer.stop();
    }
}
