package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class D {

    public void vD() {
        List<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        ListIterator<String> iterator = list.listIterator();
        iterator.next();
    }

    public void nVD() {
        System.out.println("nVD");
    }

}
