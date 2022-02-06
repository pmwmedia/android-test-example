package com.example.myapplication;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        assertThat(1 + 1).isEqualTo(3);
    }
}