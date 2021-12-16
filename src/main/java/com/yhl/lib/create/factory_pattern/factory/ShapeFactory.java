package com.yhl.lib.create.factory_pattern.factory;

import com.yhl.lib.create.factory_pattern.shape.Circle;
import com.yhl.lib.create.factory_pattern.shape.Rectangle;
import com.yhl.lib.create.factory_pattern.shape.Shape;
import com.yhl.lib.create.factory_pattern.shape.Square;

/**
 * 飞天 创建
 * on 12/1/2021 9:46 AM
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
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
}
