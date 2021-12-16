package com.yhl.lib.create.abstract_factory.shape;

/**
 * 飞天 创建
 * on 12/1/2021 10:17 AM
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
