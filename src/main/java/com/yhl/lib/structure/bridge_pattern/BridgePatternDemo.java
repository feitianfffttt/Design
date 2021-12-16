package com.yhl.lib.structure.bridge_pattern;

/**
 * 飞天 创建
 * on 12/11/2021 9:27 AM
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }
}