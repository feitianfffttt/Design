package com.yhl.lib.behavior.visitor_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:51 AM
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}