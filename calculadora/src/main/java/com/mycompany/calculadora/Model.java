package com.mycompany.calculadora;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private String currentNumber;
    private final List<String> expression;
    private final List<View> views;

    public Model() {
        currentNumber = "";
        expression = new ArrayList<String>();
        views = new ArrayList<View>();
    }

    public void addView(View view) {
        views.add(view);
    }

    public void appendNumber(int number) {
        currentNumber += number;
        updateViews();
    }

    public void appendOperator(String operator) {
        if (!currentNumber.isEmpty()) {
            expression.add(currentNumber);
            expression.add(operator);
            currentNumber = "";
            updateViews();
        }
    }

    public double calculate() {
        if (!currentNumber.isEmpty()) {
            expression.add(currentNumber);
            currentNumber = "";
        }
        
        double result = Double.parseDouble(expression.get(0));
        for (int i = 1; i < expression.size(); i += 2) {
            String operator = expression.get(i);
            double operand = Double.parseDouble(expression.get(i + 1));
            
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    if (operand != 0) {
                        result /= operand;
                    } else {
                        // Tratar divisão por zero aqui
                    }
                    break;
            }
        }
        return result;
    }

    public void clear() {
        currentNumber = "";
        expression.clear();
        updateViews();
    }

    private void updateViews() {
        for (View view : views) {
            view.updateDisplay(currentNumber);
        }
    }
}
