package designPattern._7_bridgePattern;

import designPattern._7_bridgePattern.entity.circle.GreenCircle;
import designPattern._7_bridgePattern.entity.circle.RedCircle;
import designPattern._7_bridgePattern.entity.shape.Circle;
import designPattern._7_bridgePattern.iml.Shape;

/**
 * 两个维度的连接.
 * */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}