package com.yhl.lib.structure.bridge_pattern;

/**
 * 飞天 创建
 * on 12/11/2021 9:26 AM
 */
public class Circle extends Shape {
    private final int x;
    private final int y;
    private final int radius;

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