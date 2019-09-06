package com.offer.practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhugp
 * @description 面试题3 排序
 * @date 2019/9/6 9:58
 */
public class SearchDumpNumFromArr {

    /**
     * @author zhugp
     * @description 通过array排序后进行查找
     * @date 2019/9/6 10:22
     * @param intArr
     * @return int
     **/
    public static int searchBySort(int[] intArr) {
        if (intArr == null) {
            throw new IllegalArgumentException("数组为空");
        }
        int result = -1;

        Arrays.sort(intArr);

        int pre = 0;
        for (int i = 0; i < intArr.length; pre = i++) {
            if (i != 0 && intArr[pre] == intArr[i]) {
                return intArr[i];
            }
        }

        return result;
    }

    /**
     * @author zhugp
     * @description 通过hash实现查找
     * @date 2019/9/6 10:22
     * @param intArr
     * @return int
     **/
    public static int searchByMap(int[] intArr) throws IllegalArgumentException{
        if (intArr == null) {
            throw new IllegalArgumentException("数组为空");
        }
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < intArr.length; i++) {
            if (map.containsKey(intArr[i])) {
                return intArr[i];
            }else{
                map.put(intArr[i], 0);
            }
        }
        return -1;
    }


    /**
     * @author zhugp
     * @description 空间复杂度O(1) 时间复杂度O(1)
     * @date 2019/9/6 10:48
     * @param intArr
     * @return int
     **/
    public static int seachByReSort(int[] intArr) {
        if (intArr == null) {
            throw new IllegalArgumentException("数组为空");
        }

//        校验数组是否符合规则
        for (int value : intArr) {
            if (value < 0 || value > intArr.length - 1) {
                throw new IllegalArgumentException("数组不符合要求");
            }
        }


        for (int i = 0; i < intArr.length; i++) {
            int m = intArr[i];

            if (i == m) {
                continue;
            } else {
                if (m != intArr[m]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[m];
                    intArr[m] = temp;

                    i--;
                }else{
                    return intArr[i];
                }
            }
        }
        return -1;
    }
}
