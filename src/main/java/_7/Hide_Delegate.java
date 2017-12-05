package _7;

/**
 * 隐藏委托关系
 * */
public class Hide_Delegate {
    class Person {
        Department department;

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }

        /**
         * 以前要 john.getDepartment().getManager()
         * 现在要 john,getManager()
         * 即可。
         * */
        public Person getManager() {
            return department.getManager();
        }
    }

    class Department {

        private String chargeCode;
        private Person manager;

        public Department(Person manager) {
            this.manager = manager;
        }

        public Person getManager() {
            return manager;
        }

        public String getChargeCode() {
            return chargeCode;
        }

        public void setChargeCode(String chargeCode) {
            this.chargeCode = chargeCode;
        }
    }
}
