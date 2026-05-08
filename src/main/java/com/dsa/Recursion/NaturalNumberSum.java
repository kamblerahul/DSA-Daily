package com.dsa.Recursion;

public class NaturalNumberSum {

    public static void main(String[] args) {
        System.out.println(printSum(5));
    }

    static int printSum(int n){
        if(n<=1)
            return 1;
        return n+printSum(n-1);
    }

    //TC : O(n)
    //SC : O(n)
}
