package com.epam.task.fifth.parser;

import com.epam.task.fifth.entities.Component;
import com.epam.task.fifth.entities.Composite;
import com.epam.task.fifth.parser.AbstractParser;
import com.epam.task.fifth.parser.Parser;

import java.util.Arrays;

public class SentencesParser extends AbstractParser {
    private final String SPLITTER = "[,:;]? ";

    public SentencesParser(Parser successor) {
        super(successor);
    }

    @Override
    public Component parse(String input) {
        String[] words = input.split(SPLITTER);

        Composite text = new Composite();

        Arrays.stream(words).forEach(word -> {
            Component component = getSuccessor().parse(word);
            text.add(component);
        });

        return text;
    }
}
