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
            officeTelephone.getAreaCode();
        }

        public void setOfficeAreaCode(String officeAreaCode) {
            officeTelephone.setAreaCode(officeAreaCode);
        }

        public String getOfficeNumber() {
            return officeTelephone.getNumber();
        }

        public void setOfficeNumber(String officeNumber) {
            officeTelephone.setNumber(officeNumber);
        }

        public String getTelephoneNumber() {
            return officeTelephone.getTelephoneNumber();
        }

        private String name;
        private TelephoneNumber officeTelephone = new TelephoneNumber();
    }

    class TelephoneNumber{
        private String areaCode;
        private String number;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String officeAreaCode) {
            this.areaCode = officeAreaCode;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getTelephoneNumber() {
            return ("(" + getAreaCode() + ") " + getNumber());
        }
    }

}
