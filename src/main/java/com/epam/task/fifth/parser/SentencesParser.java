package com.epam.task.fifth.parser;

import com.epam.task.fifth.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentencesParser extends AbstractParser {
    private final Pattern pattern = Pattern.compile("(\\w+)|(\\[)+(.+)+(])+$");

    public SentencesParser() {}
    public SentencesParser(Parser successor) {
        super(successor);
    }

    @Override
    public Component parse(String input) {
        Matcher matcher = pattern.matcher(input);
        List<String> list = new ArrayList<>();

        while(matcher.find()) {
            list.add(matcher.group());
        }

        Composite text = new Composite();

        list.stream().forEach(word -> {
            if(word.startsWith("[")) {
                text.add(new Leaf(word, LeafType.EXPRESSION));
            }
            else {
                text.add(new Leaf(word, LeafType.WORD));
            }
        });
        return text;
    }
}
