package _8;

public class _14_Replace_Type_Code_with_Subclasses {

    class Employee {
        private int type;
        static final int ENGINEER = 0;
        static final int SALESMAN = 1;
        static final int MANAGER = 2;

        public Employee(int type) {
            this.type = type;
        }

        public Employee() {

        }

        Employee create(int type) {
            if(type == ENGINEER) return new Engineer();
            else return new Employee(type);
//            ...
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }

    class Engineer extends Employee {

        public Engineer(int type) {
            super(type);
        }

        public Engineer() {
        }

        public int getType() {
            return Employee.ENGINEER;
        }
    }
}
