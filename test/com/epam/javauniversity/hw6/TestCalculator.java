package com.epam.javauniversity.hw6;

import org.apache.commons.cli.ParseException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculator {

    @Test
    public void testCalculatorGetResultMul() throws ParseException, NoSuchFieldException {
        String[] args = {"-l", "2", "-r", "4", "-o", "*"};
        assertEquals(new Calculator(args).getResult(), 8);
    }

    @Test
    public void testCalculatorGetResultAdd() throws ParseException, NoSuchFieldException {
        String[] args = {"-l", "3", "-r", "7", "-o", "+"};
        assertEquals(new Calculator(args).getResult(), 10);
    }

    @Test
    public void testCalculatorGetResultSub() throws ParseException, NoSuchFieldException {
        String[] args = {"-l", "3", "-r", "1", "-o", "-"};
        assertEquals(new Calculator(args).getResult(), 2);
    }

    @Test
    public void testCalculatorGetResultDiv() throws ParseException, NoSuchFieldException {
        String[] args = {"-l", "20", "-r", "5", "-o", "/"};
        assertEquals(new Calculator(args).getResult(), 4);
    }


}