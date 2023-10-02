package com.example;

import java.io.ByteArrayOutputStream;

import java.io.DataOutputStream;

import java.util.List;

import org.junit.Test;

public class TETest {

    @Test 
    public void uVETest(){
        E e_Variable = new E();
        e_Variable.vE();
    }

    @Test
    public void uETest(){
        E e_Variable = new E();
        e_Variable.nVE();
    }

    @Test
    public void vTETest() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        DataOutputStream stream = new DataOutputStream(bout);
        stream.writeDouble(5.6666);
        stream.close();
        stream.close();
    }

}
