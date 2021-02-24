package com.epam.task.fifth.parser;

import com.epam.task.fifth.entities.Component;
import com.epam.task.fifth.entities.Composite;
import com.epam.task.fifth.parser.AbstractParser;
import com.epam.task.fifth.parser.Parser;

import java.util.Arrays;

public class TextParser extends AbstractParser {

    private static final String SPLITTER = "\n";

    public TextParser(Parser successor) {
        super(successor);
    }

    @Override
    public Component parse(String input) {
        String[] paragraphs = input.split(SPLITTER);

        Composite text = new Composite();

        Arrays.stream(paragraphs).forEach(paragraph -> {
            Component component = getSuccessor().parse(paragraph);
            text.add(component);
        });

        return text;
    }
}
