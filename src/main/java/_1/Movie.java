package _1;

/**
 * 电影有小孩，普通，新票三种类型。
 * 电影标题，票价，两个属性。
 */
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    /**
     *  1. 找出逻辑泥团并运用Extract Method
     *     Alt+Shift+M Extract Method
     *  2. 函数应该放在它使用的数据所属对象内
     *     Alt+Shift+V Move Method
     * */
    double getCharge(int daysRented) {
        double result = 0;
        //determine amounts for each line
        switch (getPriceCode()) {
            case Movie.REGULAR :
                result += 2;
                if(daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE :
                result += daysRented * 3;
                break;
            case Movie.CHILDRENS :
                result += 1.5;
                if(daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    // 运用多态取代与价格相关的条件逻辑
    public int getFrequentRenterPoints(int daysRented) {
        // add bonus for a two day new release rental
        if((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1 )
            return 2;
        else
            return 1;
    }

}
