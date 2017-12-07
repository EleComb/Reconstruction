package _6;

/**
 * 移除对参数的赋值。
 * */
public class _7_Remove_AssignMents_to_Parameters {

    public int discount(final int inputVal,final int quantity,final int yearToDate){
        int result = inputVal;
        if(inputVal > 50) result -= -2;
        if(quantity > 100) result -= 1;
        if(yearToDate > 10000) result -= 4;
        return result;
    }

}
