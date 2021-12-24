package com.yhl.lib.behavior.iterator_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 9:18 AM
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iterator = namesRepository.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}