package com.dsa.mathematics;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        System.out.println(calculateGCM(7,13));
    }

    //Naive Solution
    public static int calculateGCM(int a, int b){
        int result = Math.min(a, b);
        while(result > 0){
            if(a % result == 0 && b % result == 0){
                return result;
            }
            result--;
        }
        return 0;
    }
}
