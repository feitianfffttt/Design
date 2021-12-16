package com.yhl.lib.create.abstract_factory.factory;

import com.yhl.lib.create.abstract_factory.color.Blue;
import com.yhl.lib.create.abstract_factory.color.Color;
import com.yhl.lib.create.abstract_factory.color.Green;
import com.yhl.lib.create.abstract_factory.color.Red;
import com.yhl.lib.create.abstract_factory.shape.Shape;

/**
 * 飞天 创建
 * on 12/1/2021 10:24 AM
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}