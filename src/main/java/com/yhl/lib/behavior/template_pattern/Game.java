package com.yhl.lib.behavior.template_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:44 AM
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}