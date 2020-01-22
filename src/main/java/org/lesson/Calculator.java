package org.lesson;

public class Calculator {
    public double calc(double a, String operator, double b) {
        double result = 0.0;
        if (operator.equals("+")) {
            result = a + b;
        } else if (operator.equals("-")) result = a - b;
        else if (operator.equals("*")) result = a * b;
        else if (operator.equals("/")) {
            if (b != 0) result = a / b;
            else result = 0;
        }
        return  result;
    }
}