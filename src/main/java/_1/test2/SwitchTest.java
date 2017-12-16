package _1.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwitchTest {

    public static void main(String[] args) {
        int i = 0;
        switch (i) {
            case 1:
            case 2:
            case 3:
                break;
            default:
                case 0:
                case 4:
                    System.out.println(i);
                    break;
                case 5:
                    System.out.println(i);
                    break;
        }

    }

}
