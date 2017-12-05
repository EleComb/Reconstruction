package _7;

public class Extract_Class {
    class Person {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOfficeAreaCode() {
            return officeAreaCode;
        }

        public void setOfficeAreaCode(String officeAreaCode) {
            this.officeAreaCode = officeAreaCode;
        }

        public String getOfficeNumber() {
            return officeNumber;
        }

        public void setOfficeNumber(String officeNumber) {
            this.officeNumber = officeNumber;
        }

        public String getTelephoneNumber() {
            return ("(" + officeAreaCode + ") " + officeNumber);
        }

        private String name;
        private String officeAreaCode;
        private String officeNumber;
    }

    class TelephoneNumber{
        private TelephoneNumber officeTelephone = new TelephoneNumber();
    }

}
