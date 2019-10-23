package com.offer.practise.chapter3;

/**
 * @author zhugp
 * @description 排序数组A1和A2的组合 55页
 * @date 2019/9/6 16:25
 */
public class ReplaceSpace_5_2 {

    public static int[] composeSortArr(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        int targetIndex = arr1Length + arr2Length - 1;

        int arr1Index = arr1Length - 1;
        for (int i = arr2Length; i >= 0 ; i--) {
            if(arr2[i] >= arr1[arr1Index]){
                arr1[targetIndex--] = arr2[i];
                i++;
            }else{
                arr1[targetIndex--] = arr1[arr1Index];
            }
        }

        return arr1;
    }

}
