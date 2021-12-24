package com.yhl.lib.behavior.state_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:26 AM
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}