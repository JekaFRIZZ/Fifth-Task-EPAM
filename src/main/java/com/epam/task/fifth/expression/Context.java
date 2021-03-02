package com.epam.task.fifth.expression;

import java.util.ArrayDeque;

public class Context {
    private ArrayDeque<Integer> deque = new ArrayDeque<>();

    public Integer popValue() {
        return deque.pop();
    }

    public void pushValue(Integer value) {
        this.deque.push(value);
    }
}
