package com.yhl.lib.structure.adapter_pattern;



import java.util.ArrayList;
import java.util.List;

/**
 * 飞天 创建
 * on 12/7/2021 2:36 PM
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

/*        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("a");
        list1.add("b");
        list1.add("c");

        list2.add("a1");
        list2.add("b");
        list2.add("c1");

        list1.retainAll(list2);
        System.out.println("===>"+list1.toString());*/
    }
}
