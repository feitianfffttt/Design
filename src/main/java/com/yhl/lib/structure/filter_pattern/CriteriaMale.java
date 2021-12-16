package com.yhl.lib.structure.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 飞天 创建
 * on 12/16/2021 4:46 PM
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}