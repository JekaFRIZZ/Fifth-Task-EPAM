package com.epam.task.fifth.parser;

import com.epam.task.fifth.entities.Component;
import com.epam.task.fifth.entities.Lexeme;
import com.epam.task.fifth.entities.LeafType;
import org.junit.Assert;
import org.junit.Test;


public class LexemeParserTest {
    private static final String TEXT = "best";
    private final Parser lexemeParser = new LexemeParser();

    @Test
    public void testParseWord() {
        //given
        Component expected = new Lexeme(TEXT, LeafType.WORD);
        //when
        Component actual = lexemeParser.parse(TEXT);
        //then
        Assert.assertEquals(expected,actual);
    }
}