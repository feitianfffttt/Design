package com.yhl.lib.behavior.null_object_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:09 AM
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}