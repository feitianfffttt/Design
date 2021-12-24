package com.yhl.lib.behavior.visitor_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:53 AM
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}