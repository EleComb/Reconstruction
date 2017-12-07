package _1.test;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        outputClassName();
        LoadClass();
        newClassFileAndInvokeMethod();
        System.out.println(boolean.class == Boolean.TYPE);//true
    }

    private static void newClassFileAndInvokeMethod() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        A a = (A) Class.forName("_1.test.A").newInstance();
        a.print();
    }

    private static Class<?> LoadClass() throws ClassNotFoundException {
        return Class.forName("_1.test.A");
    }


    private static void outputClassName() {
        System.out.println(int.class.getName());
        System.out.println(char.class.getName());
        System.out.println(short.class.getName());
        System.out.println(long.class.getName());
        System.out.println(byte.class.getName());
        System.out.println(float.class.getName());
        System.out.println(double.class.getName());
        System.out.println(boolean.class.getName());
        System.out.println(void.class.getName());
        System.out.println(char[].class.getName());//[C
        System.out.println(char[][].class.getName());//[[C
    }

}

