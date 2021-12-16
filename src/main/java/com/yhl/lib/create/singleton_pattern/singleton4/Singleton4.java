package com.yhl.lib.create.singleton_pattern.singleton4;

/**
 * 飞天 创建
 * on 12/7/2021 11:37 AM
 */
public class Singleton4 {
    private volatile static Singleton4 singleton;

    private Singleton4() {
    }

    public static Singleton4 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
