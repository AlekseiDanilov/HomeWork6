package com.epam.javauniversity.hw6;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestMonth {

    @Test
    public void testMonthGetNumberDayThirtyOne() {
        Month month = Month.JANUARY;
        assertEquals(month.getNumberDay(), 31);
    }

    @Test
    public void testMonthGetNumberDayThirty() {
        Month month = Month.APRIL;
        assertEquals(month.getNumberDay(), 30);
    }

    @Test
    public void testMonthGetNumberDayFebruaryNoBissextile() {
        //тест пройдет в невисокосный год
        Month month = Month.FEBRUARY;
        assertEquals(month.getNumberDay(), 28);
    }

    @Test
    public void testMonthGetNumberDayFebruaryBissextile() {
        //тест пройдет в високосный год
        Month month = Month.FEBRUARY;
        assertEquals(month.getNumberDay(), 29);
    }
}