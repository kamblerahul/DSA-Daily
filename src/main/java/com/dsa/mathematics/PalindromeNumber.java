package com.dsa.mathematics;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int number){
        int reverse =0;
        int temp = number;
        while(temp > 0){
            int ld = temp % 10;
            reverse = reverse*10+ld;
            temp = temp/10;
        }
        return number == reverse;
    }
}
