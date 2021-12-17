package com.yhl.lib.behavior.command_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 飞天 创建
 * on 12/17/2021 11:12 AM
 */
public class Broker {
    private final List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}