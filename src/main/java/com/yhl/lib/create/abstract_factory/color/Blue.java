package com.yhl.lib.create.abstract_factory.color;

/**
 * 飞天 创建
 * on 12/1/2021 10:19 AM
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
