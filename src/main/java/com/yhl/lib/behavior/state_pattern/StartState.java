package com.yhl.lib.behavior.state_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:25 AM
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
