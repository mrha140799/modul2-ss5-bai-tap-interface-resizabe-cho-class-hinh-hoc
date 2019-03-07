package Resizable;

public class CircleResizable extends Circle implements Resizeable {

    @Override
    public void resize(Circle circle) {
        circle.setRadius( circle.getRadius() +Math.random()*100);
    }
}
