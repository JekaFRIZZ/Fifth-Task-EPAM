package com.epam.task.fifth.parser;

import com.epam.task.fifth.entities.Component;
import com.epam.task.fifth.entities.Composite;

import java.util.Arrays;

public class ParagraphsParser extends AbstractParser {

    private final String SPLITTER = "[.?!]";

    public ParagraphsParser(Parser successor) {
        super(successor);
    }

    @Override
    public Component parse(String input) {
        String[] sentences = input.split(SPLITTER);

        Composite text = new Composite();

        Arrays.stream(sentences).forEach(sentence -> {
            Component component = getSuccessor().parse(sentence);
            text.add(component);
        });

        return text;
    }
}
