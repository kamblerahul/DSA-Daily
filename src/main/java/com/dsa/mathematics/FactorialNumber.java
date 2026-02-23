package com.dsa.mathematics;

public class FactorialNumber {

    public static void main(String[] args) {
        System.out.println(factorialIterative(4));
        System.out.println(factorialRecursive(5));
    }

    //Iterative Appraoch
    public static int factorialIterative(int inputNumber) {
        int fact = 1;
        if (inputNumber == 0 || inputNumber == 1) {
            return 1;
        }
        for (int i = 2; i <= inputNumber; i++) {
            fact = fact * i;
        }
        return fact;
    }

    //Recursive Approach
    public static int factorialRecursive(int inputNumber){
        if(inputNumber==0)
            return 1;
        return inputNumber * factorialRecursive(inputNumber-1);
    }

}
