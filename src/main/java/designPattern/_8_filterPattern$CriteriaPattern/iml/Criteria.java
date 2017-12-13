package designPattern._8_filterPattern$CriteriaPattern.iml;

import designPattern._8_filterPattern$CriteriaPattern.bean.Person;
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
