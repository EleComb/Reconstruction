package _8;

public class _13_Replace_Type_Code_with_Class {

    class Person {
//        public final int O = BloodGroup.O.getCode();
//        public final int A = BloodGroup.A.getCode();
//        public final int B = BloodGroup.B.getCode();
//        public final int AB = BloodGroup.AB.getCode();

        private int bloodGroup;

//        public Person(int booldGroup) {
//            this.bloodGroup = booldGroup;
//        }
//
//        public void setBloodGroup(int bloodGroup) {
//            this.bloodGroup = bloodGroup;
//        }
//
//        public int getBloodGroupCode() {
//            return bloodGroup;
//        }
    }

    static class BloodGroup {
        public static final BloodGroup O = new BloodGroup(BloodGroup.O);
        public static final BloodGroup A = new BloodGroup(BloodGroup.A);
        public static final BloodGroup B = new BloodGroup(BloodGroup.B);
        public static final BloodGroup AB = new BloodGroup(BloodGroup.AB);
        private static final BloodGroup[] values = {O, A, B, AB};

        private BloodGroup bloodGroup;

        public BloodGroup(BloodGroup bloodGroup) {
            this.bloodGroup = bloodGroup;
        }

        public static BloodGroup code(int arg) {
            return values[arg];
        }

        private void setBloodGroup(BloodGroup bloodGroup) {
            this.bloodGroup = bloodGroup;
        }

        private BloodGroup getBloodGroup() {
            return bloodGroup;
        }
    }
}
