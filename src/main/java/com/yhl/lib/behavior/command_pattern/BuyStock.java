package com.yhl.lib.behavior.command_pattern;

/**
 * 飞天 创建
 * on 12/17/2021 11:11 AM
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}