package com.dsa.mathematics;

public class FactorialNumber {


    public static void main(String[] args) {
        System.out.println(factorialIterative(4));
    }

    public static int factorialIterative(int inputNumber){
        int fact = 1;
            if(inputNumber == 0 || inputNumber == 1){
                return 1;
            }
            for(int i = 2; i<=inputNumber ;i++){
                fact = fact * i;
            }
        return fact;
        }

}
