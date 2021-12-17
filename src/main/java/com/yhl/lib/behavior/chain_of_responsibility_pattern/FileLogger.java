package com.yhl.lib.behavior.chain_of_responsibility_pattern;

/**
 * 飞天 创建
 * on 12/17/2021 10:45 AM
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
