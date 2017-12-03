package _6;

public class Extract_Method {

    private String name = "";

    public Extract_Method(String name) {
        this.name = name;
    }

    void printOwing(double amount) {
        printBanner();

        // print detail
        System.out.println("name:" + name);
        System.out.println("amount" + amount);
    }

    private void printBanner() {
        System.out.println("printBanner!");
    }

    public static void main(String[] args) {
        Extract_Method em = new Extract_Method("thisName");
        em.printOwing(11);
    }
}
