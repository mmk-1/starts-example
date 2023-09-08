package com.example;

public class D {
    private int i = 0;
    private void foo() {
        System.out.println("D foo");
        System.out.println("D foo");
    }

    private void foo2() {
        System.out.println("D foo");
        System.out.println("D foo");
        foo();
        foo3();
    }
    private void foo3() {
        System.out.println("D foo");
        System.out.println("D foo");
        System.out.println("D foo");
        i+=6; 
    }   

    public void inc(){
        i+=12;
    }


    public void in2(){
        System.out.println("inc3");
        foo();
    }

        public void in3(){
        System.out.println("inc3");
        foo();
    }


}


