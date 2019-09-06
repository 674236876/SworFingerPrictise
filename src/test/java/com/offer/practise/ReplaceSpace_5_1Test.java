package com.offer.practise;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceSpace_5_1Test {

    @Test
    public void modefyStrTest() {
        StringBuffer sb = new StringBuffer(" 123");
        Assert.assertEquals("%20123",ReplaceSpace_5_1.modefyStr(sb));
        StringBuffer sb1 = new StringBuffer("1 23");
        Assert.assertEquals("1%2023",ReplaceSpace_5_1.modefyStr(sb1));
        StringBuffer sb2 = new StringBuffer("1  23");
        Assert.assertEquals("1%20%2023",ReplaceSpace_5_1.modefyStr(sb2));
        StringBuffer sb3 = new StringBuffer("123 ");
        Assert.assertEquals("123%20",ReplaceSpace_5_1.modefyStr(sb3));

        StringBuffer sb4 = new StringBuffer("");
        Assert.assertEquals("",ReplaceSpace_5_1.modefyStr(sb4));

    }

    @Test
    public void modefyStrNoSpaceTest() {
        StringBuffer sb = new StringBuffer("123");
        Assert.assertEquals("123",ReplaceSpace_5_1.modefyStr(sb));
    }

    @Test(expected = IllegalArgumentException.class)
    public void modefyStrIsNullTest() {
        ReplaceSpace_5_1.modefyStr(null);
    }


}