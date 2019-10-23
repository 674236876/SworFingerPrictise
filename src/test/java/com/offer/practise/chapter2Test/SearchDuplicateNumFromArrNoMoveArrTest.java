package com.offer.practise.chapter2Test;

import com.offer.practise.chapter2.SearchDuplicateNumFromArrNoMoveArr_3_2;
import org.junit.Assert;
import org.junit.Test;

public class SearchDuplicateNumFromArrNoMoveArrTest {

    @Test
    public void searchDuplicateNumByNewArrTest() {

        int[] arr = {1, 3, 5, 4, 3, 2, 6, 7};
        int result = SearchDuplicateNumFromArrNoMoveArr_3_2.searchDuplicateNumByNewArr(arr);
        Assert.assertEquals(3, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchDuplicateNumByNewArrNullTest() {
        int[] arr = null;
        int result = SearchDuplicateNumFromArrNoMoveArr_3_2.searchDuplicateNumByNewArr(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchDuplicateNumByNewArrOutRangeTest() {
        int[] arr = {1, 3, 5, 4, 3, 2, 6, 9};
        int result = SearchDuplicateNumFromArrNoMoveArr_3_2.searchDuplicateNumByNewArr(arr);
        Assert.assertEquals(3, result);
    }

    @Test
    public void searchDuplicateNumBySplitTest() {

        int[] arr = {1, 3, 5, 4, 3, 2, 6, 7};
        int result = SearchDuplicateNumFromArrNoMoveArr_3_2.searchDuplicateNumBySplit(arr);
        Assert.assertEquals(3, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchDuplicateNumBySplitNullTest() {
        int[] arr = null;
        SearchDuplicateNumFromArrNoMoveArr_3_2.searchDuplicateNumBySplit(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchDuplicateNumBySplitOutRangeTest() {
        int[] arr = {1, 3, 5, 4, 3, 2, 6, 9};
        int result = SearchDuplicateNumFromArrNoMoveArr_3_2.searchDuplicateNumBySplit(arr);
        Assert.assertEquals(3, result);
    }
}