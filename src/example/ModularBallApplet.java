package example;

import java.awt.*;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class ModularBallApplet extends BallApplet{

    private Ball ball;

    @Override
    public void init() {
        super.init();
        ball = createBall();
    }

    protected Ball createBall(){
        return new BouncingBall(dim);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, dim.width, dim.height);
        ball.draw(g);
    }
}
