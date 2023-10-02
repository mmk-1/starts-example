package com.example;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class E {
    public void eViolatoinMethod() {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void eMethod() {
        System.out.println("eMethod");
    }

    public void usingDViolationMethod(){
        D d_Variable = new D();
        d_Variable.dViolationMethod();
    }

    public void usingDMethod(){
        D d_Variable = new D();
        d_Variable.dMethod();
    }
}
