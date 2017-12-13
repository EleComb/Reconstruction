package _1.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testRegx {

    public static void main(String[] args) {
        String value = "一个东西";
        String all_value = "什么一个东西啊";
        Matcher m = Pattern.compile(value).matcher(all_value);
        if(m.find()) System.out.println(m.group());
    }
}
