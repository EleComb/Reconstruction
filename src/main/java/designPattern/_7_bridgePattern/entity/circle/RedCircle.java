package designPattern._7_bridgePattern.entity.circle;

import designPattern._7_bridgePattern.iml.DrawAPI;

public class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}