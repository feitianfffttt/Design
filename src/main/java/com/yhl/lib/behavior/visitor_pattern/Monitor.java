package com.yhl.lib.behavior.visitor_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:52 AM
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
