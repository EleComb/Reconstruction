package _8;

/**
 * 自我封装字段
 * */
public class _1_Self_Encapsulate_Field {

    private int low;

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    private int high;

    boolean inchudes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }
}
