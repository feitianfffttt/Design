package com.yhl.lib.create.singleton_pattern.singleton5;

/**
 * 飞天 创建
 * on 12/7/2021 11:38 AM
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5 (){}
    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
