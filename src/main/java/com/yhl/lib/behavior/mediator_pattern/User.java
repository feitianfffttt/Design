package com.yhl.lib.behavior.mediator_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 9:47 AM
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}