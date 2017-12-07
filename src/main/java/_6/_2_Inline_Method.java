package _6;

/**
 * 内联函数。
 * */
public class _2_Inline_Method {

    int numberOfLateDeliveries = 0;

    int getRating() {
        return (numberOfLateDeliveries> 5) ? 2 : 1;
    }

}
