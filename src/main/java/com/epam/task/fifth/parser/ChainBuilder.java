package com.epam.task.fifth.parser;

public class ChainBuilder {
    public Parser parse(String input) {
        return new TextParser(new ParagraphsParser(new SentencesParser(new LexemeParser())));
    }
}
