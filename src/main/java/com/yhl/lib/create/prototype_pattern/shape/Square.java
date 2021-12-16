package com.yhl.lib.create.prototype_pattern.shape;

/**
 * 飞天 创建
 * on 12/1/2021 2:48 PM
 */
public class Square extends Shape{

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
