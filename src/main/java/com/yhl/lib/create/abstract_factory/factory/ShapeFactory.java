package com.yhl.lib.create.abstract_factory.factory;

import com.yhl.lib.create.abstract_factory.color.Color;
import com.yhl.lib.create.abstract_factory.shape.Circle;
import com.yhl.lib.create.abstract_factory.shape.Rectangle;
import com.yhl.lib.create.abstract_factory.shape.Shape;
import com.yhl.lib.create.abstract_factory.shape.Square;

/**
 * 飞天 创建
 * on 12/1/2021 10:22 AM
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
