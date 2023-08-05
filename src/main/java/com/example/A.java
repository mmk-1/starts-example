package com.example;

public class A {
    public static int i = 0;

    public static void inc(int a) {
        int x = 1;
        // x--;
        B b = new B();
        b.foo();
        x++;
    }


    public static void inc() {
        i+=10;
    }


    public static void inc2() {
        i++;
    }
    public static void main(String[] args) {

        int a = 13;
    }
}
