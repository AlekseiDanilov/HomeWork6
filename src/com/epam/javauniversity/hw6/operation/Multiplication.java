package com.epam.javauniversity.hw6.operation;

public class Multiplication implements Operation {

    @Override
    public int calculate(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }
}
