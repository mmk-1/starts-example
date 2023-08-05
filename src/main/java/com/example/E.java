package com.example;

public class E {
    private int i = 0;
    private void foo() {
        System.out.println("D foo");
        System.out.println("D foo");
        System.out.println("D foo");
        foo2();
    }

    private void foo2() {
        System.out.println("D foo");
        System.out.println("D foo");
        System.out.println("D foo");
        foo();
        foo3();
    }
    private void foo3() {
        System.out.println("D foo");
        System.out.println("D foo");
        System.out.println("D foo");
        System.out.println("D foo");
        i+=6; 
    }   

    public void inc(){
        i+=10;
    }
}
