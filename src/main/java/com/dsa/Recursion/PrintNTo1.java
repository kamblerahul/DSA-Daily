package com.dsa.Recursion;

public class PrintNTo1 {

    public static void main(String[] args) {
        printNTo1(5);
    }

//    This is Tail recursion. As there is no condition after the recursion call
    static void printNTo1(int n){
        if(n==0)
            return;
        System.out.println(n);
        printNTo1(n-1);
    }
}
