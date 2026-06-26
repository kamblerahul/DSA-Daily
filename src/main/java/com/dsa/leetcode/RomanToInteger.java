package com.dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        var result = romanToInt("MCMXCIV");
        System.out.println(result);
    }
//1994
    public static int romanToInt(String s){
        Map<Character, Integer> romanMap = new HashMap();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int sum = 0;
        for (int i=0; i < s.length()-1; i++){
            int current = romanMap.get(s.charAt(i));
        }
        return 0;
    }
}
