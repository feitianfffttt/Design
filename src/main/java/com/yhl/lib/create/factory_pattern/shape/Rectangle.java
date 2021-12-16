package com.yhl.lib.create.factory_pattern.shape;

/**
 * 飞天 创建
 * on 12/1/2021 9:44 AM
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
