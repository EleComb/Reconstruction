package _8;

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
    }

    static class Person {

        private List course;

        public List getCourse() {
            return course;
        }

        public void setCourse(List course) {
            this.course = course;
        }
    }
}
