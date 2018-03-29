package example;

import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class BouncingBall implements Ball {

    private int x, y;
    private int dx = 2, dy = 4;
    private int radius = 20;
    private Color color = Color.green;
    private Dimension dim;

    public BouncingBall(Dimension dim) {
        this.dim = dim;
        x = dim.width / 2;
        y = dim.height /2;
    }

    @Override
    public void draw(Graphics g) {
        if(x < radius || x > dim.width - radius) dx = -dx;
        if(y < radius || y > dim.height - radius) dy = -dy;

        x += dx;
        y += dy;

        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
