package _8;

/**
 * 自我封装字段
 * */
public class _1_Self_Encapsulate_Field {

    private int low;
    private int high;

    private void initialize(int low, int high) {
        this.low = low;
        this.high = high;
    }

    _1_Self_Encapsulate_Field(int low, int high) {
        initialize(low, high);
    }

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



    boolean inchudes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

}

class CappedRage extends _1_Self_Encapsulate_Field {

    private int cap;

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    CappedRage(int low, int high, int cap) {
        super(low, high);
        this.cap = cap;
    }
}