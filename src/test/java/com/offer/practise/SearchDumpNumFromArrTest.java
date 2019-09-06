package com.offer.practise;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhugp
 * @description 面试题3 排序测试
 * @date 2019/9/6 10:51
 * @param null
 * @return 
 **/
public class SearchDumpNumFromArrTest {


    @Test
    public void searchBySortNoDumpTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = SearchDumpNumFromArr.searchBySort(arr);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void searchBySortExistDumpTest() {
        int[] arr = {1, 4, 1, 2, 4};
        int result = SearchDumpNumFromArr.searchBySort(arr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void searchBySortExistDumpTest1() {
        int[] arr = {1, 4, 1, 2, 3};
        int result = SearchDumpNumFromArr.searchBySort(arr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void searchBySortExistDumpTest2() {
        int[] arr = {-1, 4, 1, 2, 3, 4};
        int result = SearchDumpNumFromArr.searchBySort(arr);
        Assert.assertEquals(4, result);
    }


    @Test
    public void searchByMapNoDumpTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = SearchDumpNumFromArr.searchByMap(arr);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void searchByMapExistDumpTest() {
        int[] arr = {1, 4, 1, 2, 4};
        int result = SearchDumpNumFromArr.searchByMap(arr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void searchByMapExistDumpTest1() {
        int[] arr = {1, 4, 1, 2, 3};
        int result = SearchDumpNumFromArr.searchByMap(arr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void searchByMapExistDumpTest2() {
        int[] arr = {-1, 4, 1, 2, 3, 4};
        int result = SearchDumpNumFromArr.searchByMap(arr);
        Assert.assertEquals(4, result);
    }


    @Test(expected = IllegalArgumentException.class)
    public void searchByMapExistDumpTest3() {
        int[] arr = null;
        int result = SearchDumpNumFromArr.searchByMap(arr);
        Assert.assertEquals(4, result);
    }

    @Test
    public void searchByResortExistDumpTest() {
        int[] arr = {1, 3, 1, 2, 4};
        int result = SearchDumpNumFromArr.seachByReSort(arr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void searchByResortExistDumpTest1() {
        int[] arr = {1, 4, 1, 2, 3};
        int result = SearchDumpNumFromArr.seachByReSort(arr);
        Assert.assertEquals(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchByResortExistDumpTest2() {
        int[] arr = {-1, 4, 1, 2, 3, 4};
        int result = SearchDumpNumFromArr.seachByReSort(arr);
        Assert.assertEquals(4, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchByResortExistDumpTest3() {
        int[] arr = null;
        int result = SearchDumpNumFromArr.seachByReSort(arr);
        Assert.assertEquals(4, result);
    }
}