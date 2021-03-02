package com.epam.task.fifth.parser;

import com.epam.task.fifth.entities.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ParagraphsParserTest {
    private final Parser sentenceParser = Mockito.mock(SentencesParser.class);
    private final Parser paragraphParser = new ParagraphsParser(sentenceParser);

    private final String FIRST_SENTENCE = "The best";
    private final String SECOND_SENTENCE = "It`s true";
    private final String FINAL_SENTENCE = FIRST_SENTENCE + ". " + SECOND_SENTENCE;

    @Test
    public void testParseShouldParseParagraphsReturnSentence() {
        //given
        Component firstComponent = new Composite(Arrays.asList(
                new Leaf("The", LeafType.WORD),
                new Leaf("best", LeafType.WORD)
        ));
        Component secondComponent = new Composite(Arrays.asList(
                new Leaf("It`s", LeafType.WORD),
                new Leaf("true", LeafType.WORD)
        ));
        Component expected = new Composite(Arrays.asList(firstComponent, secondComponent));
        //when
        when(sentenceParser.parse(FIRST_SENTENCE)).thenReturn(firstComponent);
        when(sentenceParser.parse(SECOND_SENTENCE)).thenReturn(secondComponent);
        Component actual = paragraphParser.parse(FINAL_SENTENCE);
        //then
        Assert.assertEquals(expected,actual);
    }
}