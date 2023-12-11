package com.example;

import java.util.ArrayList;
import java.util.Iterator;

import it.unimi.dsi.fastutil.Pair;

public class A {

    public int aField = 0;

    public void aViolationMethod() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);
        Iterator i = l.iterator();
        i.next();
    }

    public void aMethod() {
        System.out.println("aMethod");
    }

    public void aFieldMethod1() {
        System.out.println("aFieldMethod 1");
        aField += 1;
    }

    public void aFieldMethod2() {
        System.out.println("aFieldMethod 2");
        aField -= 1;
    }

}
