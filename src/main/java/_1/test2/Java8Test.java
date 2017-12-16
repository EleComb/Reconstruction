package _1.test2;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Test {

    public static void main(String[] args) {
        Java8Test java8Test = new Java8Test();
        java8Test.test();
    }

    public void test() {

        List<String> list = getList();
        Set<Map<String,Object>> setMap = list.stream().map(this::getMap).collect(Collectors.toSet());
        for(Map<String, Object> set : setMap) {
            System.out.println(set);
        }
    }

    List getList() {
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        return list;
    }

    Map<String, Object> getMap(String str) {
        Map map = new HashMap();
        map.put(str, newMap());
        map.put(str, newMap2());
        return map;
    }

    Map<String, Object> newMap2() {
        Map map = new HashMap();
        List list = new ArrayList();
        map.put("name1", "tableName");
        map.put("field1", list);
        map.put("charset1", "utf-8");
        return map;
    }

    Map<String, Object> newMap() {
        Map map = new HashMap();
        List list = new ArrayList();
        map.put("name", "tableName");
        map.put("field", list);
        map.put("charset", "utf-8");
        return map;
    }

}
