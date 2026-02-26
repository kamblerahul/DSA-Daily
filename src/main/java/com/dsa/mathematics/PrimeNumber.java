package com.dsa.mathematics;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(isPrimeWithSqRt(1031));
        System.out.println(isPrimeMoreEfficient(1031));

    }

    //TC O(n)
    static boolean isPrime(int input){
        if(input == 1)
            return false;
        for(int i=2; i <input; i++){
            if(input%i==0)
                return false;
        }
        return true;
    }

    // TC O(Sq.rt(n))
    static boolean isPrimeWithSqRt(int n){
        if(n == 1)
            return false;
        for(int i=2; i*i <= n; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    //more optimised
    static boolean isPrimeMoreEfficient(int n){
        if(n == 1)
            return false;
        if(n ==2 || n== 3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(int i=5; i*i<=n; i=i+6){
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
}
