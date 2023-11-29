package lab15;

public class CalculatorModel {
    private double num1;
    private double num2;
    private double result;

    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        result = num1 + num2;
    }

    public void subtract() {
        result = num1 - num2;
    }

    public void multiply() {
        result = num1 * num2;
    }

    public void divide() {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            result = Double.NaN; // Обработка деления на ноль
        }
    }

    public double getResult() {
        return result;
    }
}
