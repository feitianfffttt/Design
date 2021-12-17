package com.yhl.lib.structure.proxy_pattern;

/**
 * 飞天 创建
 * on 12/17/2021 10:10 AM
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}