package com.yhl.lib.behavior.observer_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:18 AM
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}