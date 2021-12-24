package com.yhl.lib.behavior.strategy_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:38 AM
 */
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}