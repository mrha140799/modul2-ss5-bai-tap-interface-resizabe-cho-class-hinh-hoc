package Resizable;

public class CircleResizable extends Circle implements Resizeable {

    @Override
    public void resize(Circle circle ,double percent) {
        circle.setRadius( circle.getRadius()*percent/100);
    }
}
