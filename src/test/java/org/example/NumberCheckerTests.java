package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCheckerTests {
    @Test
    public void positiveTest(){
        NumberChecker numberChecker = new NumberChecker();
        assertEquals("Positive", numberChecker.check(1));
    }
    @Test
    public void negativeTest(){
        NumberChecker numberChecker = new NumberChecker();
        assertEquals("Negative", numberChecker.check(-1));
    }
    @Test
    public void zeroTest(){
        NumberChecker numberChecker = new NumberChecker();
        assertEquals("Zero", numberChecker.check(0));
    }
}
