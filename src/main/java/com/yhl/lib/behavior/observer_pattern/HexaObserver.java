package com.yhl.lib.behavior.observer_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:19 AM
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}