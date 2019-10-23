package com.leetcode.practise;

/**
 * @author zhugp
 * @description 移除元素leetcode 27
 * @date 2019/9/10 17:46
 */
public class RemoveInt {
    public static void main(String args[]){
        int[] arr = {3, 3};
        System.out.println(removeElement(arr, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int ans = 0;
        for(int num: nums) {
            if(num != val) {
                nums[ans] = num;
                ans++;
            }
        }
        return ans;
    }
}
