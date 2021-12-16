package com.yhl.lib.create.abstract_factory.factory;

import com.yhl.lib.create.abstract_factory.color.Color;
import com.yhl.lib.create.abstract_factory.shape.Shape;

/**
 * 飞天 创建
 * on 12/1/2021 10:21 AM
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
