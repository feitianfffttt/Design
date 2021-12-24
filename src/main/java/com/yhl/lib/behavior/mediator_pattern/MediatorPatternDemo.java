package com.yhl.lib.behavior.mediator_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 9:47 AM
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
