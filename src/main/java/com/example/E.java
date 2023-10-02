package com.example;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class E {
    public void vE() {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void nVE() {
        System.out.println("nVE");
    }

    public void uVD(){
        D d_Variable = new D();
        d_Variable.vD();
    }

    public void uNVD(){
        D d_Variable = new D();
        d_Variable.nVD();
    }
}
