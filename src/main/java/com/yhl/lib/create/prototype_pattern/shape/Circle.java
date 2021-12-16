package com.yhl.lib.create.prototype_pattern.shape;

/**
 * 飞天 创建
 * on 12/1/2021 2:49 PM
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
