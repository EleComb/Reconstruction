package _1.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * https://www.cnblogs.com/haodawang/p/5967185.html
 */
public class ReflectTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, NoSuchFieldException, InvocationTargetException {
        //返回A的构造方法
        Constructor c = A.class.getConstructor();
        //返回A类的所有为public 声明的构造方法
        Constructor[] cons = A.class.getConstructors();
        //返回A类所有的构造方法，包括private
        Constructor[] cons2 = A.class.getDeclaredConstructors();
        //返回A类的第一个public 方法
        Method m = A.class.getMethod("say");
        //执行
        m.invoke(A.class.newInstance(), null);
        //返回A类所有的public 方法
        Method[] ms = A.class.getMethods();
        //返回A类所有的方法，包括private
        Method[] allMs = A.class.getDeclaredMethods();
        //返回A类的public字段
        Field field = A.class.getField("i");
        System.out.println(field.get(A.class.newInstance()));
        //返回A类的static 字段
//        System.out.println(field.get(null));
    }

}

