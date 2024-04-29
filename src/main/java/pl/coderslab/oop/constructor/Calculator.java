package pl.coderslab.oop.constructor;

import java.util.Arrays;

public class Calculator {

    private String[] historyOfOperations;

    public Calculator(){
        this.historyOfOperations = new String[0];
    }

    protected void logOperation(String operation){
        this.historyOfOperations = Arrays.copyOf(this.historyOfOperations, this.historyOfOperations.length + 1);
        this.historyOfOperations[this.historyOfOperations.length - 1] = operation;
    }

    public int add(int num1, int num2){
        int result = num1 + num2;
        this.logOperation("added " + num1 + " to " + num2+ " got " + result);
        return result;
    }


    public int subtract(int num1, int num2){
        int result = num1 - num2;
        this.logOperation("subtracted " + num2 + " from " + num1+ " got " + result);
        return  result;
    }

    public int multiply(int num1, int num2){
        int result = num1 * num2;
        logOperation(String.format("multiplied %d with %d got %d", num1, num2, result));
        return result;
    }

    public int divide(int num1, int num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        }
        int result = num1 / num2;
        logOperation(String.format("divided %d by %d got %d", num1, num2, result));
        return result;
    }

    public void printOperations(){
        if (this.historyOfOperations.length == 0){
            System.out.println("MEMORY IS EMPTY");
        }
        for (String operation : this.historyOfOperations){
            System.out.println(operation);
        }
    }

    public void clearOperations(){
        this.historyOfOperations = new String[0];
    }

}
