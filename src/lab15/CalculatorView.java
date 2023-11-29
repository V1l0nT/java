package lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView {
    public JTextField numField1;
    public JTextField numField2;
    public JLabel resultLabel;
    public JButton addButton;
    public JButton subtractButton;
    public JButton multiplyButton;
    public JButton divideButton;

    public CalculatorView() {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        numField1 = new JTextField(10);
        numField2 = new JTextField(10);
        resultLabel = new JLabel("Результат: ");
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        JPanel operatorPanel = new JPanel();
        operatorPanel.add(addButton);
        operatorPanel.add(subtractButton);
        operatorPanel.add(multiplyButton);
        operatorPanel.add(divideButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(numField1.getText());
                    double number2 = Double.parseDouble(numField2.getText());
                    double result = number1 + number2;
                    resultLabel.setText("Результат: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Ошибка: Введите числа");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(numField1.getText());
                    double number2 = Double.parseDouble(numField2.getText());
                    double result = number1 - number2;
                    resultLabel.setText("Результат: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Ошибка: Введите числа");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(numField1.getText());
                    double number2 = Double.parseDouble(numField2.getText());
                    double result = number1 * number2;
                    resultLabel.setText("Результат: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Ошибка: Введите числа");
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(numField1.getText());
                    double number2 = Double.parseDouble(numField2.getText());
                    if (number2 == 0) {
                        resultLabel.setText("Ошибка: Деление на ноль");
                    } else {
                        double result = number1 / number2;
                        resultLabel.setText("Результат: " + result);
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Ошибка: Введите числа");
                }
            }
        });

        frame.add(new JLabel("Число 1: "));
        frame.add(numField1);
        frame.add(new JLabel("Число 2: "));
        frame.add(numField2);
        frame.add(operatorPanel);
        frame.add(resultLabel);

        frame.pack();
        frame.setVisible(true);
    }
}

