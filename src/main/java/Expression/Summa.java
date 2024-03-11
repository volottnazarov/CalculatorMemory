package Expression;

import Expression.ExpressionDigit;

public class Summa implements ExpressionDigit {
    private double oneDigit;
    private double secondDigit;

    public Summa(double oneDigit, double secondDigit) {
        this.oneDigit = oneDigit;
        this.secondDigit = secondDigit;
    }

    public void setOneDigit(double oneDigit) {
        this.oneDigit = oneDigit;
    }

    public void setSecondDigit(double secondDigit) {
        this.secondDigit = secondDigit;
    }

    @Override
    public String toString() {
        return  oneDigit + " + " + secondDigit + " = " +
                (oneDigit + secondDigit);
    }

    @Override
    public double expDig() {

        return oneDigit + secondDigit;
    }
}
