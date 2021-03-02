package com.epam.task.fifth.parser;

import com.epam.task.fifth.entities.Component;
import com.epam.task.fifth.entities.Lexeme;

public class LexemeParser extends AbstractParser {

    @Override
    public Component parse(String input) {
        return new Lexeme(input);
    }
}
