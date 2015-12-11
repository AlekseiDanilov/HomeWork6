package com.epam.javauniversity.hw6;

import org.apache.commons.cli.ParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, ParseException, NoSuchFieldException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] argsForCalculator = reader.readLine().split(" ");
        Calculator calculator = new Calculator(argsForCalculator);
        System.out.println(calculator.getResult());
    }
}
