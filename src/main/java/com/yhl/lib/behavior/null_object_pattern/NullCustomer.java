package com.yhl.lib.behavior.null_object_pattern;

/**
 * 飞天 创建
 * on 12/24/2021 10:10 AM
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}