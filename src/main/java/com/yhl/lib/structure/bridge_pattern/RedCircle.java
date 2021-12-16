package com.yhl.lib.structure.bridge_pattern;

/**
 * 飞天 创建
 * on 12/11/2021 9:25 AM
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}