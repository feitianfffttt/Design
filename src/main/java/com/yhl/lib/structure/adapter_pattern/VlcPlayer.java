package com.yhl.lib.structure.adapter_pattern;

/**
 * 飞天 创建
 * on 12/7/2021 2:33 PM
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}