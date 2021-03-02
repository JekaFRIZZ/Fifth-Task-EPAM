package com.epam.task.fifth.expression;

public class NonterminalExrpessionNumber extends AbstractExpression{
    private int number;

    public NonterminalExrpessionNumber(int number) {
        this.number = number;
    }
    @Override
    public void interpreter(Context context) {
        context.pushValue(number);
    }
}
