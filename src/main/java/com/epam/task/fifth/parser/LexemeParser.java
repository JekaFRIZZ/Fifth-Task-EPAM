package com.epam.task.fifth.parser;

import com.epam.task.fifth.entities.Component;
import com.epam.task.fifth.entities.Leaf;

public class LexemeParser extends AbstractParser {
    @Override
    public Component parse(String input) {
        return new Leaf(input);
    }
}
