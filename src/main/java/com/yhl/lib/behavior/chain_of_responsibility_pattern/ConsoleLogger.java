package com.yhl.lib.behavior.chain_of_responsibility_pattern;

/**
 * 飞天 创建
 * on 12/17/2021 10:44 AM
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
