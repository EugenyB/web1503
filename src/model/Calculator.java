package model;

/**
 * Created by eugen on 15.03.2017.
 */
public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getSum() {
        return a + b;
    }
}
