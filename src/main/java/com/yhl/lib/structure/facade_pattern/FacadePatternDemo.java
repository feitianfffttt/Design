package com.yhl.lib.structure.facade_pattern;

/**
 * 飞天 创建
 * on 12/16/2021 4:38 PM
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
