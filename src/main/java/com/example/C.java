package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class C extends B {

    public void vC() {
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

    public void nVC() {
        System.out.println("nVC");
    }

}
