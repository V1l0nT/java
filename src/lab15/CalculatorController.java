package lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        view.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(view.numField1.getText());
                    double number2 = Double.parseDouble(view.numField2.getText());
                    model.setNumbers(number1, number2);
                    model.add();
                    view.resultLabel.setText("Результат: " + model.getResult());
                } catch (NumberFormatException ex) {
                    view.resultLabel.setText("Ошибка: Введите числа");
                }
            }
        });

        view.subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(view.numField1.getText());
                    double number2 = Double.parseDouble(view.numField2.getText());
                    model.setNumbers(number1, number2);
                    model.subtract();
                    view.resultLabel.setText("Результат: " + model.getResult());
                } catch (NumberFormatException ex) {
                    view.resultLabel.setText("Ошибка: Введите числа");
                }
            }
        });

        view.multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(view.numField1.getText());
                    double number2 = Double.parseDouble(view.numField2.getText());
                    model.setNumbers(number1, number2);
                    model.multiply();
                    view.resultLabel.setText("Результат: " + model.getResult());
                } catch (NumberFormatException ex) {
                    view.resultLabel.setText("Ошибка: Введите числа");
                }
            }
        });

        view.divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(view.numField1.getText());
                    double number2 = Double.parseDouble(view.numField2.getText());
                    model.setNumbers(number1, number2);
                    model.divide();
                    view.resultLabel.setText("Результат: " + model.getResult());
                } catch (NumberFormatException ex) {
                    view.resultLabel.setText("Ошибка: Введите числа");
                }
            }
        });
    }
}