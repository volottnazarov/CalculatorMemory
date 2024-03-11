package Expression;

public class Operation {
    private int operation;

    public Operation(int operation) {
        this.operation = operation;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Номер арифметическго знака: " + operation;
    }
}
