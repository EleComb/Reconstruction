package _6;

/**
 * 内联函数。
 * */
public class Inline_Method {

    int numberOfLateDeliveries = 0;

    int getRating() {
        return (numberOfLateDeliveries> 5) ? 2 : 1;
    }

}
