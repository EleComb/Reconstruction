package _1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客会租用影片
 * */
public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer (String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    /**
     * 生成详单的函数。
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while(rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount = amountFor(each);

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1 )
                frequentRenterPoints++;

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(totalAmount) + "\n";
            totalAmount += thisAmount;
         }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    // 找出逻辑泥团并运用Extract Method
    // Alt+Shift+M Extract Method
    private double amountFor(Rental aRental) {
        double result = 0;
        //determine amounts for each line
        switch (aRental.getMovie().getPriceCode()) {
            case Movie.REGULAR :
                result += 2;
                if(aRental.getDaysRented() > 2)
                    result += (aRental.getDaysRented() - 2) * 1.5;
            break;
            case Movie.NEW_RELEASE :
                result += aRental.getDaysRented() * 3;
            break;
            case Movie.CHILDRENS :
                result += 1.5;
                if(aRental.getDaysRented() > 3)
                    result += (aRental.getDaysRented() - 3) * 1.5;
            break;
        }
        return result;
    }
}
