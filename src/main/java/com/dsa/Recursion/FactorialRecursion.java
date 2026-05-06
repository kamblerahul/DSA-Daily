package com.dsa.Recursion;

public class FactorialRecursion {

    public static void main(String[] args) {
        //System.out.println(fact(5));
        System.out.println(factTailRecursion(5,1));

    }

    static int fact(int n){
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);
    }

    static int factTailRecursion(int n, int k){
        if(n==0 || n==1)
            return k;
        System.out.println("value of n = " +n + " ,value of k = " +k + " ,value of k*n =" + k*n);
        return factTailRecursion(n-1,k*n);
    }

}
