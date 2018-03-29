package example;

/**
 * Author: Aleksandr Diamond on 3/29/2018
 * Assignment: SolarSystem
 * Purpose:
 */
public class OrbitingBallApplet extends ModularBallApplet{
    @Override
    protected Ball createBall() {
        return new OrbitingBall(dim);
    }
}
