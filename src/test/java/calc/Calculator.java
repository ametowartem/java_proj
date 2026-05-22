package calc;

public class Calculator {
    private int currentValue;

    public void setInitialValue(int value) {
        this.currentValue = value;
    }

    public int add(int value) {
        return this.currentValue + value;
    }
}