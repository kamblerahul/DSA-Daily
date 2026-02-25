package com.dsa.mathematics;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        System.out.println(calculateGCM(7,13));
        System.out.println(calculateGCMEfficient(100,200));
        System.out.println(euclideanSolution2(50,100));

    }

    // TC = O(min(a,b)) and SC = O(1)
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

    public static int calculateGCMEfficient(int a, int b){
        while(a != b){
            if(a > b)
            a = a-b;
            else
                b = b - a;
        }
        return a;
    }

    // Euclidean ALgo
    // TC = O(log(min(a,b))) and SC = O(1)
    public static int euclideanSolution(int a, int b){
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        if(a==b)
            return a;
        else
            return euclideanSolution(max-min, min);

    }

    // Euclidean ALgo
    // TC = O(log(min(a,b))) and SC = O(1)
    static int euclideanSolution2(int a, int b){
        if(b==0) return a;
        else return euclideanSolution2(b, a%b);
    }
}
