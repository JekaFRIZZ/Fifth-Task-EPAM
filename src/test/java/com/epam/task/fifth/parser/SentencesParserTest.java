package com.epam.task.fifth.parser;

import com.epam.task.fifth.entities.Component;
import com.epam.task.fifth.entities.Composite;
import com.epam.task.fifth.entities.Leaf;
import com.epam.task.fifth.entities.LeafType;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SentencesParserTest {
    private final String SENTENCE = "The best [8 2 7 4 + * -]";
    private final SentencesParser parser = new SentencesParser();

    @Test
    public void testParseShouldParseSentenceReturnLexemes() {
        //given
        Component expected = new Composite(Arrays.asList(
                new Leaf("The", LeafType.WORD),
                new Leaf("best", LeafType.WORD),
                new Leaf("[8 2 7 4 + * -]", LeafType.EXPRESSION)
        ));
        //when
        Component actual = parser.parse(SENTENCE);
        //then
        Assert.assertEquals(expected,actual);
    }
}