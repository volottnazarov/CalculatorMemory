package Expression;

import Expression.ExpressionDigit;

public class Multipl implements ExpressionDigit {
    private double oneDigit;
    private double secondDigit;

    public Multipl(double oneDigit, double secondDigit) {
        this.oneDigit = oneDigit;
        this.secondDigit = secondDigit;
    }

    public double getOneDigit() {
        return oneDigit;
    }

    public void setOneDigit(double oneDigit) {
        this.oneDigit = oneDigit;
    }

    public double getSecondDigit() {
        return secondDigit;
    }

    public void setSecondDigit(double secondDigit) {
        this.secondDigit = secondDigit;
    }

    @Override
    public double expDig() {
        return oneDigit * secondDigit;
    }
    @Override
    public String toString() {
        return oneDigit + " * " + secondDigit + " = " +
                (oneDigit * secondDigit);
    }


}
