package com.yhl.lib.structure.decorator_pattern;

/**
 * 飞天 创建
 * on 12/16/2021 4:22 PM
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}