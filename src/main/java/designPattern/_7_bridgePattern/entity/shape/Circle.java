package designPattern._7_bridgePattern.entity.shape;

import designPattern._7_bridgePattern.iml.DrawAPI;
import designPattern._7_bridgePattern.iml.Shape;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}