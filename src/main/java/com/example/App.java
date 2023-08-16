package com.example;


import java.util.Collection;

public class App
{
    public int count (Collection<String> collection) {
        int count = 0;
        for (String element : collection) {
            count++;
        }
        count ++;
        count --;
        return count;
    }

}
