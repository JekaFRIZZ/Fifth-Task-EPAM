package com.epam.task.fifth.expression;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpressionCalculator {
    private final static String PLUS = "+";
    private final static String MINUS = "-";
    private final static String MULTIPLIER = "*";
    private final static String DIVIDER = "/";
    private final static String SPLITTER = " ";

    private ArrayList<AbstractExpression> parse(String expression) {
       ArrayList<AbstractExpression> expressions = new ArrayList<>();
        for(String elementExpression : expression.split(SPLITTER)) {
            switch (elementExpression) {
                case PLUS :
                    expressions.add(new TerminalExpressionPlus());
                    break;
                case MINUS :
                    expressions.add(new TerminalExpressionMinus());
                    break;
                case MULTIPLIER :
                    expressions.add(new TerminalExpressionMultiply());
                    break;
                case DIVIDER :
                    expressions.add(new TerminalExpressionDivide());
                default :
                    Scanner scanner = new Scanner(elementExpression);
                    if(scanner.hasNextInt()) {
                        expressions.add(new NonterminalExrpessionNumber(scanner.nextInt()));
                    }
            }
        }
        return expressions;
    }

    public int calculate(String text) {
        ArrayList<AbstractExpression> list = parse(text);
        Context context = new Context();
        for(AbstractExpression terminal : list) {
            terminal.interpreter(context);
        }
        return context.popValue();
    }
}
