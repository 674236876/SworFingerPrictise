package com.leetcode.practise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhugp
 * @description 随机联系 罗马数字转int  leetcode题库13
 * @date 2019/9/10 9:53
 */
public class Roman13 {

    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static void main(String args[]){
        System.out.println(toInt("MMMCDXC"));
    }

    public static int toInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        char[] arr = s.toCharArray();
        int result = 0;
        int lastIndex = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; lastIndex = i--) {
            if ((arr[lastIndex] == 'V' || arr[lastIndex] == 'X') && arr[i] == 'I') {
                result -= 1;
            } else if ((arr[lastIndex] == 'L' || arr[lastIndex] == 'C') && arr[i] == 'X') {
                result -= 10;
            } else if ((arr[lastIndex] == 'D' || arr[lastIndex] == 'M') && arr[i] == 'C') {
                result -= 100;
            } else {
                result += map.get(arr[i]);
            }
        }
        return result;
    }
}
