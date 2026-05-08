package com.dsa.Recursion;

public class BaseCasesWriting {

    public static void main(String[] args) {

    }

    static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }

    static int fibonacci(int n){
//        if(n==0)
//            return 0;
//        if(n==1)
//            return 1;
        // or
        if(n<=1)
            return 1;
        return  fibonacci(n-1)+fibonacci(n-2);
    }
}
