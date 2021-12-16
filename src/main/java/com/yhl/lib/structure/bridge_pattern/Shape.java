package com.yhl.lib.structure.bridge_pattern;

/**
 * 飞天 创建
 * on 12/11/2021 9:26 AM
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
