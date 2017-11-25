package _1;

/**
 * 顾客租了某个影片
 * */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    /**
     *  1. 找出逻辑泥团并运用Extract Method
     *     Alt+Shift+M Extract Method
     *  2. 函数应该放在它使用的数据所属对象内
     *     Alt+Shift+V Move Method
     * */
    double getCharge() {
        double result = 0;
        //determine amounts for each line
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR :
                result += 2;
                if(getDaysRented() > 2)
                    result += (getDaysRented() - 2) * 1.5;
            break;
            case Movie.NEW_RELEASE :
                result += getDaysRented() * 3;
            break;
            case Movie.CHILDRENS :
                result += 1.5;
                if(getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
            break;
        }
        return result;
    }

    public int getFrequentRenterPoints() {
        // add bonus for a two day new release rental
        if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1 )
            return 2;
        else
            return 1;
    }
}
