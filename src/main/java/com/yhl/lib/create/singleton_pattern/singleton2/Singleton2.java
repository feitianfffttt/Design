package com.yhl.lib.create.singleton_pattern.singleton2;

/**
 * 飞天 创建
 * on 12/7/2021 11:35 AM
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2 (){}
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
