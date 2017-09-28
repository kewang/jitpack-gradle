package com.github.kewang;

import org.junit.Assert;
import org.junit.Test;

public class StringGradleUtilsTest {
    @Test
    public void testIsEmpty() {
        Assert.assertTrue(StringGradleUtils.isEmpty(""));
        Assert.assertTrue(StringGradleUtils.isEmpty(null));
        Assert.assertFalse(StringGradleUtils.isEmpty("Hello World"));
    }
}