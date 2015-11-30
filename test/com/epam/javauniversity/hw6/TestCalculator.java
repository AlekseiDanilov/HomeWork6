package com.epam.javauniversity.hw6;

import org.apache.commons.cli.ParseException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculator {

    @Test
    public void testCalculatorGetResultMul() throws ParseException {
        String[] args = {"-l", "2", "-r", "3", "-o", "*"};
        assertEquals(new Calculator(args).getResult(), 6);
    }

    @Test
    public void testCalculatorGetResultAdd() throws ParseException {
        String[] args = {"-l", "2", "-r", "3", "-o", "+"};
        assertEquals(new Calculator(args).getResult(), 5);
    }

    @Test
    public void testCalculatorGetResultDed() throws ParseException {
        String[] args = {"-l", "2", "-r", "3", "-o", "-"};
        assertEquals(new Calculator(args).getResult(), -1);
    }

    @Test
    public void testCalculatorGetResultDiv() throws ParseException {
        String[] args = {"-l", "6", "-r", "2", "-o", "/"};
        assertEquals(new Calculator(args).getResult(), 3);
    }

    @Test
    public void testCalculatorGetResultDivZero() throws ParseException {
        String[] args = {"-l", "6", "-r", "0", "-o", "/"};
        assertEquals(new Calculator(args).getResult(), 0);
    }

    @Test
    public void testCalculatorGetResultNull() throws ParseException {
        String[] args = null;
        assertEquals(new Calculator(args).getResult(), 0);
    }

    @Test
    public void testCalculatorGetResultEmpty() throws ParseException {
        String[] args = {};
        assertEquals(new Calculator(args).getResult(), 0);
    }
}