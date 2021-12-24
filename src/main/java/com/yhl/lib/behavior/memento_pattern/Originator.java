package com.yhl.lib.behavior.memento_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 9:58 AM
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}