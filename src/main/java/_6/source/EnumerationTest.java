package _6.source;

import com.sun.org.apache.xpath.internal.operations.Lt;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class EnumerationTest implements Enumeration {

    List list;
    int i;

    public EnumerationTest() {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(new Order(i));
        }
        this.list = list;
    }

    public boolean hasMoreElements() {
        if(i < list.size()) return true;
        return false;
    }

    public Object nextElement() {
        return list.get(i++);
    }
}
