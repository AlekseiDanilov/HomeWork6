package com.epam.javauniversity.hw6.operation;

public class Division implements Operation {

    @Override
    public int calculate(int leftOperand, int rightOperand) {
        if (rightOperand == 0) {
            throw new IllegalArgumentException("right operand is 0, can not divide by 0");
        }
        return leftOperand / rightOperand;
    }
}
