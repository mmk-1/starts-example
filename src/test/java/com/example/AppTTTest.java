package com.example;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;

import org.junit.Test;

public class AppTTTest
{
    @Test
    public void countSynchronizedCollection() {
        Collection c = Collections.synchronizedCollection(Arrays.asList("Foo", "Bar"));
        A a = new A();
        assertEquals(2, a.countT(c));
    }
}
