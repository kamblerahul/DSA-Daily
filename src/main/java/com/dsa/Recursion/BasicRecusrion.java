package com.dsa.Recursion;

public class BasicRecusrion {

    public static void main(String[] args) {
        print1ToN(5);
        print1TONTailRecursion(5,1);
    }

    static void print1ToN(int n){
        if(n == 0)
            return;
        print1ToN(n-1);
        System.out.println(n);
    }


    //Tail Recursion: As there is no condition after the recursion call
    static void print1TONTailRecursion(int n, int k){
        if (n==0)
            return;
        System.out.println(k);
        print1TONTailRecursion(n-1, k+1);

    }
}
