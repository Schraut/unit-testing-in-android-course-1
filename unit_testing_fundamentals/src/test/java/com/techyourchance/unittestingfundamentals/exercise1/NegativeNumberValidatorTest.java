package com.techyourchance.unittestingfundamentals.exercise1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class NegativeNumberValidatorTest {
    // SUT stands for system under test
    NegativeNumberValidator SUT;

    // Before annotation is used on a method containing java code to run before
    // each test case. It runs before each test execution.
    @Before
    public void setup() {
        SUT = new NegativeNumberValidator();
    }
    // After annotation is used on a method containing java code to run after each
    // test case

    @Test
    public void test1() {
        boolean result = SUT.isNegative(-1);
        Assert.assertThat(result, is(true));
    }

}