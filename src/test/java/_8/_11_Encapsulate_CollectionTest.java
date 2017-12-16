package _8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _11_Encapsulate_CollectionTest {

    @Test
    public void main() {
        _11_Encapsulate_Collection.Person kent = new _11_Encapsulate_Collection.Person();
        List s = new ArrayList();
        s.add(new _11_Encapsulate_Collection.Course("Smalltalk Programming", false));
        s.add(new _11_Encapsulate_Collection.Course("Appreciating Single Malts", true));
        kent.setCourse(s);
        Assert.assertEquals(2, kent.getCourse().size());
        _11_Encapsulate_Collection.Course refact = new _11_Encapsulate_Collection.Course("Refactoring", true);
        kent.addCorse(refact);
        kent.addCorse(new _11_Encapsulate_Collection.Course("Brutal Sarcasm", false));
        Assert.assertEquals(4, kent.getCourse().size());
        kent.getCourse().remove(refact);
        Assert.assertEquals(3, kent.getCourse().size());

        int count = numberOfAdvancedCourses(kent);
        System.out.println(count);
    }

    private int numberOfAdvancedCourses(_11_Encapsulate_Collection.Person person) {
        Iterator iter = person.getCourse().iterator();
        int count = 0;
        while (iter.hasNext()) {
            _11_Encapsulate_Collection.Course each = (_11_Encapsulate_Collection.Course) iter.next();
            if (each.isAdvanced()) count++;
        }
        return count;
    }
}
