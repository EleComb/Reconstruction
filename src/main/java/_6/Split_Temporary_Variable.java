package _6;

/**
 * 分解临时变量
 * */
public class Split_Temporary_Variable {

    private double height = 1, width = 2;

    private double primaryForce = 3, mass = 4, secondaryForce = 5;
    int delay = 6;

    public void test() {
        final double perimeter = 2 * (height * width);
        System.out.println(perimeter);
        final double area = height * width;
        System.out.println(area);
    }

    //范例2
    double getDistanceTravelled(int time) {
        double result;
        result = getPrimaryResult(time);
        if(getSecondaryTime(time) > 0) {
            result += getSecondaryResult(time);
        }
        return result;
    }

    private double getSecondaryResult(int time) {
        return getPrimaryVel() + getSecondaryTime(time) + 0.5 * getSecondaryAcc() * getSecondaryTime(time) * getSecondaryTime(time);
    }

    private double getSecondaryAcc() {
        return (primaryForce + secondaryForce) / mass;
    }

    private double getPrimaryVel() {
        return getPrimaryAcc() * delay;
    }

    private int getSecondaryTime(int time) {
        return time - delay;
    }

    private double getPrimaryResult(int time) {
        return 0.5 * getPrimaryAcc() * getPrimaryTime(time) * getPrimaryTime(time);
    }

    private int getPrimaryTime(int time) {
        return Math.min(time, delay);
    }

    private double getPrimaryAcc() {
        return primaryForce / mass;
    }
}
