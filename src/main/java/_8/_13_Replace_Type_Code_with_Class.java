package _8;

public class _13_Replace_Type_Code_with_Class {

    class Person {
        public static final int O = 0;
        public static final int A = 1;
        public static final int B = 2;
        public static final int AB = 3;

        private int bloodGroup;

        public Person(int booldGroup) {
            this.bloodGroup = booldGroup;
        }

        public void setBloodGroup(int bloodGroup) {
            this.bloodGroup = bloodGroup;
        }

        public int getBloodGroup() {
            return bloodGroup;
        }
    }
}
