package com.yhl.lib.create.prototype_pattern;

import com.yhl.lib.create.prototype_pattern.cache.ShapeCache;
import com.yhl.lib.create.prototype_pattern.shape.Shape;

/**
 * 飞天 创建
 * on 12/3/2021 11:14 AM
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        Shape clonedShapeCode = (Shape) ShapeCache.getShape("1");

        System.out.println("Shape : " + clonedShape.getType() +" hashCode1="+clonedShape.hashCode());
        System.out.println("Shape : " + clonedShapeCode.getType() +" clonedShapeCode="+clonedShapeCode.hashCode());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

    }
}
