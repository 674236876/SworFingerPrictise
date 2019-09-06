package com.offer.practise;

import org.junit.Assert;
import org.junit.Test;

public class SearchDuplicateNumFromArrNoMoveArrTest {

    @Test
    public void searchDuplicateNumByNewArrTest() {

        int[] arr = {1, 3, 5, 4, 3, 2, 6, 7};
        int result = SearchDuplicateNumFromArrNoMoveArr.searchDuplicateNumByNewArr(arr);
        Assert.assertEquals(3, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchDuplicateNumByNewArrNullTest() {
        int[] arr = null;
        int result = SearchDuplicateNumFromArrNoMoveArr.searchDuplicateNumByNewArr(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchDuplicateNumByNewArrOutRangeTest() {
        int[] arr = {1, 3, 5, 4, 3, 2, 6, 9};
        int result = SearchDuplicateNumFromArrNoMoveArr.searchDuplicateNumByNewArr(arr);
        Assert.assertEquals(3, result);
    }

    @Test
    public void searchDuplicateNumBySplitTest() {

        int[] arr = {1, 3, 5, 4, 3, 2, 6, 7};
        int result = SearchDuplicateNumFromArrNoMoveArr.searchDuplicateNumBySplit(arr);
        Assert.assertEquals(3, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchDuplicateNumBySplitNullTest() {
        int[] arr = null;
        SearchDuplicateNumFromArrNoMoveArr.searchDuplicateNumBySplit(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchDuplicateNumBySplitOutRangeTest() {
        int[] arr = {1, 3, 5, 4, 3, 2, 6, 9};
        int result = SearchDuplicateNumFromArrNoMoveArr.searchDuplicateNumBySplit(arr);
        Assert.assertEquals(3, result);
    }
}