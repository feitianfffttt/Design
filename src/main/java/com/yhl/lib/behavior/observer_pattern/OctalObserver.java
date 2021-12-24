package com.yhl.lib.behavior.observer_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:19 AM
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}