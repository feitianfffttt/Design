package com.yhl.lib.structure.decorator_pattern;

/**
 * 飞天 创建
 * on 12/16/2021 4:21 PM
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}