package lecture46_final;

public class FinalTestClass {
    // we can initialize final variable (or attribute) directly or in constructor
    // but we need to initialize only once



    // 1. initialize directly
    private final double PI = 3.14;



    // 2. initialize in constructor
    private final double CALCULATION_FROM_PI_VALUE;

    public FinalTestClass() {
        this.CALCULATION_FROM_PI_VALUE = PI * 2;
    }
}
