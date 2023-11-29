package lab15;

public class CalculatorAppMVC{
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view =  new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);
    }
}
