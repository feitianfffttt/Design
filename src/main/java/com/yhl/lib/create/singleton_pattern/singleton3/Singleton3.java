package com.yhl.lib.create.singleton_pattern.singleton3;

/**
 * 飞天 创建
 * on 12/7/2021 11:36 AM
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}