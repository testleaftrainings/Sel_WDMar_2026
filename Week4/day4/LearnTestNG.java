package com.testng.sample;

import org.testng.annotations.Test;

public class LearnTestNG {
@Test    //Mark a class or a method as part of the test.
    public void aFastTest() {
        System.out.println("Fast test");
    }
@Test
    public void aSlowTest() {
        System.out.println("Slow test");
    }
}
