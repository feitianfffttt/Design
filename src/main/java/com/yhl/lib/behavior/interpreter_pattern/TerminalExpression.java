package com.yhl.lib.behavior.interpreter_pattern;

/**
 * 飞天 创建
 * on 12/17/2021 11:31 AM
 */
public class TerminalExpression implements Expression {

    private final String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}