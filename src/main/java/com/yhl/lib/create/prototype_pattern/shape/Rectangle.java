package com.yhl.lib.create.prototype_pattern.shape;

/**
 * 飞天 创建
 * on 12/1/2021 2:47 PM
 */
public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
