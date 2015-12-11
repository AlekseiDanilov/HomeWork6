package com.epam.javauniversity.hw6;

import com.epam.javauniversity.hw6.operation.*;
import org.apache.commons.cli.*;

public class Calculator {
    private int leftOperand;
    private int rightOperand;
    private Operation operation;

    public Calculator(String[] args) throws ParseException {
        if (args == null) {
            throw new IllegalArgumentException("args is null");
        }
        if (args.length == 0) {
            throw new IllegalArgumentException("args is empty");
        }
        Options options = new Options();
        options.addOption(OptionBuilder.
                withLongOpt("left_operand").
                isRequired().
                withType(PatternOptionBuilder.NUMBER_VALUE).
                hasArg().
                withDescription("left operand").
                withArgName("leftOperand").
                create("l"));
        options.addOption(OptionBuilder.
                withLongOpt("right_operand").
                isRequired().
                withType(PatternOptionBuilder.NUMBER_VALUE).
                hasArg().
                withDescription("right operand").
                withArgName("rightOperand").
                create("r"));
        options.addOption(OptionBuilder.
                withLongOpt("operation").
                isRequired().
                withType(PatternOptionBuilder.CLASS_VALUE).
                hasArg().
                withDescription("operation").
                withArgName("operation").
                create("o"));

        CommandLineParser commandLineParser = new PosixParser();
        try {
            CommandLine commandLine = commandLineParser.parse(options, args);
            setLeftOperand(Integer.parseInt(commandLine.getOptionValue("left_operand")));
            setRightOperand(Integer.parseInt(commandLine.getOptionValue("right_operand")));
            setOperation(commandLine.getOptionValue("operation"));
        } catch (MissingOptionException moe) {
            System.err.println("incorrect input");
        }
    }

    public int getResult() throws NoSuchFieldException {
        if (operation == null) {
            throw new NoSuchFieldException("operation is null");
        }
        return operation.calculate(getLeftOperand(), getRightOperand());
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        switch (operation) {
            case "+": {
                setOperation(new Addition());
                break;
            }
            case "-": {
                setOperation(new Substraction());
                break;
            }
            case "*": {
                setOperation(new Multiplication());
                break;
            }
            case "/": {
                setOperation(new Division());
                break;
            }
        }
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
