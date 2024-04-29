package pl.coderslab.oop.inheritance;

import pl.coderslab.oop.constructor.Calculator;

public class AdvancedCalculator extends Calculator {

    public double pow(int num1, int num2){
        double result = Math.pow(num1, num2);
        super.logOperation(num1 + "^" + num2 + " equals " + result);
        return result;
    }

    public double root(int num1, int num2){
        double result = Math.pow(num1, 1.0/num2);
        super.logOperation(num1 + " root of " + num2 + " equals " + result);
        return result;
    }
}
