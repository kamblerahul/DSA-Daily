package com.dsa.mathematics;

public class CountDigit {

    public static void main(String[] args) {
        countDigit(7);
    }

    public static void countDigit(int input){
        int count = 0;
        while(input > 0){
            input = input / 10;
            count++;
        }
        System.out.println(count);
    }
}
