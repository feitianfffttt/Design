package com.yhl.lib.behavior.visitor_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:52 AM
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}