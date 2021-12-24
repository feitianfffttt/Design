package com.yhl.lib.behavior.mediator_pattern;

import java.util.Date;

/**
 * 飞天 创建
 * on 12/24/2021 9:46 AM
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
