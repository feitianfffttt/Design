package com.yhl.lib.behavior.state_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:26 AM
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}