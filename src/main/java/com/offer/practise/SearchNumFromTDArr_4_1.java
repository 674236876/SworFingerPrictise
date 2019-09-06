package com.offer.practise;

/**
 * @author zhugp
 * @description 面试题四 二维数组查找 该二维数组的每一行从右到左依次递增，从上到下依次递增
 * @date 2019/9/6 15:16
 */
public class SearchNumFromTDArr_4_1 {

    /**
     * @param tdArr 二维数组
     * @param found 待查找的数字
     * @return
     * @author zhugp
     * @description 查找步骤
     * int found = 需要查找的数
     * 1.获取二维数组最右上角的数字与found进行比较，
     * 2.如果该数字==found则查找停止，如果该数字>found则剔除该列，如果该数字<found则剔除该行
     * @date 2019/9/6 15:18
     **/
    public static boolean isContain_rightTop(int[][] tdArr,int rows,int columns, int found) throws IllegalArgumentException {
        boolean result = false;

        if (tdArr == null) {
            throw new IllegalArgumentException("数组不能为空");
        }

        int row = 0;
        int colum = columns - 1;
        while (row < rows && colum >= 0) {
            if (tdArr[row][colum] == found) {
                result = true;
                break;
            } else if (tdArr[row][colum] > found) {
                colum--;
            } else {
                row++;
            }
        }
        return result;
    }


    /**
     * @param tdArr 二维数组
     * @param found 待查找的数字
     * @return
     * @author zhugp
     * @description 查找步骤
     * int found = 需要查找的数
     * 1.获取二维数组最左下角的数字与found进行比较 （左下的数字是一列中最大的，一行中最小的）
     * 2.如果该数字==found则查找停止，如果该数字>found则剔除该行，如果该数字<found则剔除该列
     * @date 2019/9/6 15:18
     **/
    public static boolean isContain_leftBottom(int[][] tdArr,int rows,int columns, int found) throws IllegalArgumentException {
        boolean result = false;

        if (tdArr == null) {
            throw new IllegalArgumentException("数组不能为空");
        }

        int row = rows - 1;
        int column = 0;
        while (row >= 0 && column < columns) {
            if (tdArr[row][column] == found) {
                result = true;
                break;
            }else if(tdArr[row][column] > found){
                row--;
            }else{
                column++;
            }
        }
        return result;

    }

}
