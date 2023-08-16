package com.example;

import java.util.ArrayList;
import java.util.Iterator;

class C extends B {
    private static int i = 0;

    public void foo() {
        System.out.println("C foo");
        System.out.println("C foo");
        System.out.println("C foo");
        System.out.println("C foo");
    }

    public void negativeTest1() {
        new ArrayList<>().iterator().next();
    }

    private static void testIterator(Iterable<String> strings) {
        final Iterator<String> si = strings.iterator();

        si.next();
        si.next();
    }

}
