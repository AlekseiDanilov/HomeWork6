package com.epam.javauniversity.hw6;

import org.apache.commons.cli.*;

public class Calculator {
    private int leftOperand;
    private int rightOperand;
    private String operation;

    public Calculator(String[] args) throws ParseException {
        if (args == null || args.length == 0) {
            operation = "";
            return;
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
                withType(PatternOptionBuilder.STRING_VALUE).
                hasArg().
                withDescription("operation").
                withArgName("operation").
                create("o"));

        CommandLineParser commandLineParser = new PosixParser();
        CommandLine commandLine = commandLineParser.parse(options, args);
        setLeftOperand(Integer.parseInt(commandLine.getOptionValue("left_operand")));
        setRightOperand(Integer.parseInt(commandLine.getOptionValue("right_operand")));
        setOperation(commandLine.getOptionValue("operation"));

    }

    public int getResult() {
        switch (getOperation()) {
            case "+": {
                return getLeftOperand() + getRightOperand();
            }
            case "-": {
                return getLeftOperand() - getRightOperand();
            }
            case "*": {
                return getLeftOperand() * getRightOperand();
            }
            case "/": {
                if (getRightOperand() == 0) {
                    return 0;
                }
                return getLeftOperand() / getRightOperand();
            }
        }
        return 0;
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

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
