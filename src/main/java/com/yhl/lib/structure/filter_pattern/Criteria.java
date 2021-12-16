package com.yhl.lib.structure.filter_pattern;

import java.util.List;

/**
 * 飞天 创建
 * on 12/16/2021 4:45 PM
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
