package com.yhl.lib.behavior.memento_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 飞天 创建
 * on 12/24/2021 10:01 AM
 */
public class CareTaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}