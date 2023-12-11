package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import it.unimi.dsi.fastutil.ints.IntArrayList;

class C extends B {

    public void cViolationMethod() {
        List<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        Iterator<String> iterator = list.iterator();
        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        try {
            iterator.remove(); // This will violate the specification
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException");
        }
    }

    public void cMethod() {
        System.out.println("cMethod");
    }

    public void usingDViolationMethod(){
        D d_Variable = new D();
        d_Variable.dViolationMethod();
    }

    public void usingDMethod(){
        D d_Variable = new D();
        d_Variable.dMethod();
    }

    public void externalLib(){
        IntArrayList l = new IntArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        // l.add(4);    

        Iterator i = l.iterator();
        i.next();

    }
}

