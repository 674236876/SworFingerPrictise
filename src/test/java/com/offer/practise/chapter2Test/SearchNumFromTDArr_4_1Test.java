package com.offer.practise.chapter2Test;

import com.offer.practise.chapter2.SearchNumFromTDArr_4_1;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchNumFromTDArr_4_1Test {

    @Test
    public void isContainTest() {
        int[][] tdArr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean result = SearchNumFromTDArr_4_1.isContain_rightTop(tdArr, 4, 4, 7);
        assertTrue(result);
    }

    @Test
    public void isContainTest1() {
        int[][] tdArr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean result = SearchNumFromTDArr_4_1.isContain_rightTop(tdArr, 4, 4, 16);
        assertFalse(result);
    }

    @Test
    public void isContainTest2() {
        int[][] tdArr = {{1}};
        boolean result = SearchNumFromTDArr_4_1.isContain_rightTop(tdArr, 1, 1, 1);
        assertTrue(result);
    }

    @Test
    public void isContainTest3() {
        int[][] tdArr = {{1}};
        boolean result = SearchNumFromTDArr_4_1.isContain_rightTop(tdArr, 1, 1, 2);
        assertFalse(result);
    }


    @Test
    public void isContainTest_leftBottom() {
        int[][] tdArr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean result = SearchNumFromTDArr_4_1.isContain_leftBottom(tdArr, 4, 4, 7);
        assertTrue(result);
    }

    @Test
    public void isContainTest1_leftBottom() {
        int[][] tdArr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean result = SearchNumFromTDArr_4_1.isContain_leftBottom(tdArr, 4, 4, 16);
        assertFalse(result);
    }

    @Test
    public void isContainTest2_leftBottom() {
        int[][] tdArr = {{1}};
        boolean result = SearchNumFromTDArr_4_1.isContain_leftBottom(tdArr, 1, 1, 1);
        assertTrue(result);
    }

    @Test
    public void isContainTest3_leftBottom() {
        int[][] tdArr = {{1}};
        boolean result = SearchNumFromTDArr_4_1.isContain_leftBottom(tdArr, 1, 1, 2);
        assertFalse(result);
    }


}