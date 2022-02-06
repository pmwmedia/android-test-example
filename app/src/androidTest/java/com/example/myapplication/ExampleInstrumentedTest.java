package com.example.myapplication;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Ignore;
import org.junit.Test;

public class ExampleInstrumentedTest {
    @Test
    public void passedTest() {
        assertThat(1 + 1).isEqualTo(2);
    }

    @Test
    public void failedTest() {
        assertThat(1 + 1).isEqualTo(3);
    }

    @Test
    @Ignore
    public void skippedTest() {
        fail("Should be skipped");
    }
}