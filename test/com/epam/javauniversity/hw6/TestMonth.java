package com.epam.javauniversity.hw6;

import org.junit.Test;

import java.util.Date;

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
        Month month = Month.FEBRUARY;
        Date date = new Date();
        if (Month.checkCurrentYearBissextile(date)) {
            assertEquals(month.getNumberDay(), 29);
        }
        assertEquals(month.getNumberDay(), 28);
    }

    @Test
    public void testMonthGetNextMonthFebruary() {
        assertEquals(Month.JANUARY.getNextMonth(), Month.FEBRUARY);
    }

    @Test
    public void testMonthGetNextMonthJune() {
        assertEquals(Month.MAY.getNextMonth(), Month.JUNE);
    }

    @Test
    public void testMonthGetNextMonthJanuary() {
        assertEquals(Month.DECEMBER.getNextMonth(), Month.JANUARY);
    }

    @Test
    public void testMonthCheckCurrentYearBissextileHundredTrue() {
        Date date = new Date();
        date.setYear(2000);
        assertTrue(Month.checkCurrentYearBissextile(date));
    }

    @Test
    public void testMonthCheckCurrentYearBissextileHundredFalse() {
        Date date = new Date();
        date.setYear(1900);
        assertFalse(Month.checkCurrentYearBissextile(date));
    }

    @Test
    public void testMonthCheckCurrentYearBissextileFalse() {
        Date date = new Date();
        date.setYear(2015);
        assertFalse(Month.checkCurrentYearBissextile(date));
    }

    @Test
    public void testMonthCheckCurrentYearBissextileTrue() {
        Date date = new Date();
        date.setYear(2016);
        assertTrue(Month.checkCurrentYearBissextile(date));
    }
}