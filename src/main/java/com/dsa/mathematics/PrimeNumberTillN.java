package com.dsa.mathematics;

public class PrimeNumberTillN {
    public static void main(String[] args) {
        primeNumberTillN(30);
    }

    static void primeNumberTillN(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int input){
        if(input == 1)
            return false;
        for(int i=2; i*i<=input; i++){
            if(input%i==0)
                return false;
        }
        return true;
    }
}
