package com.dsa.leetcode;

public class palindrome {

    public static void main(String[] args) {
        var result = checkPalindrome(12345);
        System.out.println(result);
    }

    public static boolean checkPalindrome(int input){
        //12345
        int reverse = 0;
        int lastDigit = 0;
        int temp = input;
        while(temp>0){
            lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp /10;
        }
        return (reverse == input) ? true : false;
    }
}
