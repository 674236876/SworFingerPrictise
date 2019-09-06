package com.offer.practise;

/**
 * @author zhugp
 * @description 在不移动数组元素的情况下查找重复的数据
 * @see SearchDumpNumFromArr
 * @date 2019/9/6 11:27
 */
public class SearchDuplicateNumFromArrNoMoveArr {

    public static int searchDuplicateNumByNewArr(int[] intArr) throws IllegalArgumentException {

        if (intArr == null) {
            throw new IllegalArgumentException("数组为空");
        }

        int[] temp = new int[intArr.length];

        for (int i : intArr) {
            if (i < 0 || i > intArr.length - 1) {
                throw new IllegalArgumentException("数组不符合要求");
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            int value = intArr[i];
            if (temp[value] == 0) {
                temp[value] = intArr[i];
            } else {
                return value;
            }
        }

        return -1;

    }


    public static int searchDuplicateNumBySplit(int[] intArr) throws IllegalArgumentException {
        if (intArr == null) {
            throw new IllegalArgumentException("数组为空");
        }
        for (int i : intArr) {
            if (i < 0 || i > intArr.length - 1) {
                throw new IllegalArgumentException("数组不符合要求");
            }
        }

//       由于数组存的是1 ~ n的数据
        int min = 1;
        int max = intArr.length-1;
        while (max >= min) {
            int middle = (min + max) / 2;

            //该范围中数字的个数 1~3 共 三个数
            int num = middle - min + 1;

            int count = numShowCount(min, middle, intArr);
            if (min == max) {
                if (count > 0) {
                    return min;
                }else{
                    break;
                }
            }

            if (count > num) {
                max = middle;
            }else{
                min = middle + 1;
            }
        }
        return -1;
    }

    public static int numShowCount(int min, int max, int[] arr) {
        //计数器 遍历过程中满足该范围内时+1
        int count = 0;

        for (int value : arr) {
            if (value >= min && value <= max) {
                count++;
            }
        }
        return count;
    }


}
