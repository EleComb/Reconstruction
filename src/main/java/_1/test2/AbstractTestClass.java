package _1.test2;

public class AbstractTestClass {

    public static void testOutput() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println("test!");
        testOutput2();
        Class cls = Class.forName("_1.test2.TestClass1");
        TestClass1 test = (TestClass1) cls.newInstance();
        test.testOutput2();
    }

    public static void testOutput2(){
        System.out.println("test!test!");
    }
}
