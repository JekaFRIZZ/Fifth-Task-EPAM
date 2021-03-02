package com.epam.task.fifth.parser;

import com.epam.task.fifth.entities.Component;
import com.epam.task.fifth.entities.Composite;
import com.epam.task.fifth.entities.Leaf;
import com.epam.task.fifth.entities.LeafType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.mockito.Mockito.when;

public class TextParserTest {
    private final ParagraphsParser paragraphsParser = Mockito.mock(ParagraphsParser.class);
    private final TextParser textParser = new TextParser(paragraphsParser);

    private final String FIRST_TEXT = "The best";
    private final String SECOND_TEXT = "It`s true";
    private final String FINAL_TEXT = FIRST_TEXT + "\n" + SECOND_TEXT;

    @Test
    public void testParserShouldParseTextReturnParagraphs() {
        //given
        Component firstComponent = new Composite(Arrays.asList(
            new Leaf("The", LeafType.WORD),
            new Leaf("best", LeafType.WORD)
        ));
        Component secondComponent = new Composite(Arrays.asList(
            new Leaf("It`s", LeafType.WORD),
            new Leaf("true", LeafType.WORD)
        ));
        Component expected = new Composite(Arrays.asList(firstComponent,secondComponent));
        //when
        when(paragraphsParser.parse(FIRST_TEXT)).thenReturn(firstComponent);
        when(paragraphsParser.parse(SECOND_TEXT)).thenReturn(secondComponent);
        Component actual = textParser.parse(FINAL_TEXT);
        //then
        Assert.assertEquals(expected,actual);
    }
}