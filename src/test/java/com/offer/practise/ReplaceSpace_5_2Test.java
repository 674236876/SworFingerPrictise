package com.offer.practise;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceSpace_5_2Test {

    @Test
    public void composeSortArrTest() {
        int[] arr1 = new int[10];
        for (int i = 0; i < 4; i++) {
            arr1[i] = i;
        }


        int[] arr2 = {2, 3, 4, 5};

        int[] result = ReplaceSpace_5_2.composeSortArr(arr1, arr2);
        assertEquals(result[0],0);
        assertEquals(result[7], 5);

    }
}