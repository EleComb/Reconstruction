package _6;

import java.util.Arrays;
import java.util.List;

/**
 * 替换算法
 * */
public class _9_Substitute_Algorithm {

    String foundPerson(String[] people) {
        List candidates = Arrays.asList(new String[]{"Don", "John", "Kent"});
        for (int i = 0; i < people.length; i++) {
            if(candidates.contains(people[i]))
                return people[i];
        }
//        for (int i = 0; i < people.length; i++) {
//            if(people[i].equals("Don")) {
//                return "Don";
//            }
//            if(people[i].equals("John")) {
//                return "John";
//            }
//            if(people[i].equals("Kent")) {
//                return "Kent";
//            }
//        }
        return "";
    }

}
