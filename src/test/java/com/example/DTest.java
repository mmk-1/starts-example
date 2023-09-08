package com.example;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

import com.example.A;

/**
 * Unit test for simple App.
 */
public class DTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMethod1() {
        D d = new D();
        d.inc();
    }

    @Test
    public void testMethod2() {
        D d = new D();
        d.inc();
    }

    @Test
    public void testMethod3() {
        D d = new D();
        d.inc();
    }

    @Test
    public void testMethod4() {
        D d = new D();
        d.inc();
    }

    @Test
    public void testMethod5() {
        D d = new D();
        d.inc();
    }

    @Test
    public void negativeTest1() {
        D d = new D();
        d.inc();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);
        Iterator i = l.iterator();
        i.next();
    }


        @Test
    public void negativeTest2() {
        D d = new D();
        d.inc();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);
        Iterator i = l.iterator();
        i.next();
    }



}
