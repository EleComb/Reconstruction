package _8;

/**
 * 以字面常量取代魔法数
 * */
public class _9_Replace_Magic_Number_with_Symbilic_Costant {

    static final double GRAVITATIONAL_CONSTANT = 9.81;

    double potentialEnergy(double mass, double height) {
        return mass * GRAVITATIONAL_CONSTANT * height;
    }
}
