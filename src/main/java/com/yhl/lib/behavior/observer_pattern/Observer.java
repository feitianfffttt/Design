package com.yhl.lib.behavior.observer_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:17 AM
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}