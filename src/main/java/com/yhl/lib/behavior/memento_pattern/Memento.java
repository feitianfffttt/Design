package com.yhl.lib.behavior.memento_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 9:58 AM
 */
public class Memento {
    private final String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}