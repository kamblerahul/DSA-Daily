package com.dsa.mathematics;

public class LCM {
    public static void main(String[] args) {
        System.out.println(calculateLCM(12,15));
    }

    //4, 6 => 12
    //TC O(a*b)
    public static int calculateLCM(int a, int b){
        int result = Math.max(a,b);
        while(a!=b){
            if(result % a ==0 && result % b == 0){
                return result;
            }
            result++;
        }
        return result;
    }

    // to get GCD
    //TC for GCD : log(min(a,b))
    static int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b, a%b);

    }

    //formula for LCM = (a*b)/GCD(a,b)
    //TC :
    static int calculateLCMEuclidean(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
