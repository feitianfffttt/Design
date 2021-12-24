package com.yhl.lib.behavior.template_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:45 AM
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}