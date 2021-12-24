package com.yhl.lib.behavior.strategy_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:38 AM
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}