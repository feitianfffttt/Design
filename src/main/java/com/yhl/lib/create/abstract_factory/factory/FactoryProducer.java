package com.yhl.lib.create.abstract_factory.factory;

/**
 * 飞天 创建
 * on 12/1/2021 10:25 AM
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
