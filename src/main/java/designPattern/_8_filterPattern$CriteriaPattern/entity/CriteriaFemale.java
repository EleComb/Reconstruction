package designPattern._8_filterPattern$CriteriaPattern.entity;

import designPattern._8_filterPattern$CriteriaPattern.bean.Person;
import designPattern._8_filterPattern$CriteriaPattern.iml.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

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