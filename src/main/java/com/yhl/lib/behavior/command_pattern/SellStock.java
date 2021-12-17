package com.yhl.lib.behavior.command_pattern;

/**
 * 飞天 创建
 * on 12/17/2021 11:11 AM
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}