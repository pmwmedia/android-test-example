package com.example.myapplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

public class ExampleInstrumentedTest {
    @Test
    public void passedTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void failedTest() {
        assertEquals(3, 1 + 1);
    }

    @Test
    @Ignore
    public void skippedTest() {
        fail("Should be skipped");
    }
}