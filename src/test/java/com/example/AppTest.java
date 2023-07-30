package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.A;
import com.example.B;
import com.example.C;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void ATest()
    {
        A a = new A();
        A.inc(1);
        assertTrue( true );
    }

    @Test
    public void BTest()
    {
        B b = new B();
        b.foo();
        assertTrue( true );
    }

    @Test
    public void CTest()
    {
        C c = new C();
        c.foo();
        int i = 0;
        assertTrue( true );
    }
}
