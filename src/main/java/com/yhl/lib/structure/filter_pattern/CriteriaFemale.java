package com.yhl.lib.structure.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 飞天 创建
 * on 12/16/2021 4:47 PM
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}