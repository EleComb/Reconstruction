package _8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 封装集合
 * */
public class _11_Encapsulate_Collection {

    static class Course {
        public Course (String name, boolean isAdvanced) {

        }

        public boolean isAdvanced() {
            return false;
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

    static class Person {

        private List course = new ArrayList();

        public List getCourse() {
            return Collections.unmodifiableList(course);
        }

        public void setCourse(List course) {
            this.course = course;
        }

        public void addCorse(Course course) {
            this.course.add(course);
        }

        public void initializeCourses(List list) {
            Iterator iter = list.iterator();
            this.course.addAll(list);
//            while (iter.hasNext()) {
//                addCorse((Course) iter.next());
//            }
        }

        public void removeCourse(Course course) {
            this.course.remove(course);
        }
    }
}
