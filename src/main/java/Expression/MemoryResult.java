package Expression;

public class MemoryResult implements ExpressionDigit{
    private double resultDigit;


    public MemoryResult(double resultDigit) {
        this.resultDigit = resultDigit;
    }

    public double getResultDigit() {
        return resultDigit;
    }

    public void setResultDigit(double resultDigit) {
        this.resultDigit = resultDigit;
    }

    @Override
    public double expDig() {
        return ++resultDigit;
    }
}
