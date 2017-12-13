package designPattern._8_filterPattern$CriteriaPattern.entity;

import designPattern._8_filterPattern$CriteriaPattern.bean.Person;
import designPattern._8_filterPattern$CriteriaPattern.iml.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}