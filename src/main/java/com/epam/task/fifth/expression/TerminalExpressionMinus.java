package com.epam.task.fifth.expression;

public class TerminalExpressionMinus extends AbstractExpression{
    @Override
    public void interpreter(Context context) {
        context.pushValue(context.popValue() - context.popValue());
    }
}
