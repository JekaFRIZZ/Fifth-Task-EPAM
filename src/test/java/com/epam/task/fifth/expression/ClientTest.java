package com.epam.task.fifth.expression;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
    private static final String EXPRESSION = "8 2 7 4 + * -";

    @Test
    public void testCalculate() {
        //given
        ExpressionCalculator client = new ExpressionCalculator();
        //when
        int actual = client.calculate(EXPRESSION);
        //then
        Assert.assertEquals(14,actual);
    }

}