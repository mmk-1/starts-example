package com.example;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Arrays;

import org.junit.Test;

public class TCTest {
    @Test
    public void uVCTest1() {
        C c_Variable = new C();
        c_Variable.cViolationMethod();
    }

    @Test
    public void uVCTest2() {
        C c_Variable = new C();
        c_Variable.bViolationMethod();
    }

    @Test
    public void uCTest() {
        C c_Variable = new C();
        c_Variable.cMethod();
    }

    @Test
    public void vTCTest() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        DataOutputStream stream = new DataOutputStream(bout);
        stream.writeDouble(5.25648);
        byte[] n = bout.toByteArray();
        stream.flush();
    }
}
