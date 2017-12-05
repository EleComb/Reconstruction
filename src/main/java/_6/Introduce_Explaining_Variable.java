package _6;

/**
 * 引入解释性变量
 * */
public class Introduce_Explaining_Variable {

    private double quantity, itemPrice;

    public void test() {
        String platform = "MAC", browser = "IE";
        int resize = 1;

        final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;
        if( isMacOs && isIEBrowser &&
            wasInitialized() && wasResized) {
            System.out.println(1);
        }
    }

    private boolean wasInitialized() {
        return true;
    }

    double price() {
        // price is base price - quantity discount + shipping
        final double basePrice = quantity * itemPrice;
        final double quantityDiscount =  Math.max(0, quantity - 500) * itemPrice * 0.05;
        final double shipping = Math.min(basePrice * 0.1, 100);
        return basePrice - quantityDiscount + shipping;
    }
}
