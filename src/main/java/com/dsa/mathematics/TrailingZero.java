package com.dsa.mathematics;

public class TrailingZero {
    public static void main(String[] args) {
        int fact = getFactorial(5);
        System.out.println( countTrailingZero(fact));
    }

    public static int getFactorial(int input){
        int factorial = 1;
        for (int i = 2; i <= input; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    //Naive Solution
    public static int countTrailingZero(int input){
        int count = 0;
        while(input > 0){
            if(input % 10 == 0){
                count++;
            }
            input = input/10;
        }
        return count;
    }
}
