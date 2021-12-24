package com.yhl.lib.behavior.observer_pattern;

import java.util.ArrayList;
import java.util.List;


/**
 * 飞天 创建
 * on 12/24/2021 10:16 AM
 */
public class Subject {

    private final List<Observer> observers  = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
