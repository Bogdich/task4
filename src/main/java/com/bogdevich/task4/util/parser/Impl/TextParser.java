package com.bogdevich.task4.util.parser.Impl;

import com.bogdevich.task4.entity.composite.AbstractComponent;
import com.bogdevich.task4.entity.composite.Component;
import com.bogdevich.task4.entity.type.ComponentType;
import com.bogdevich.task4.util.parser.AbstractParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by Adrienne on 25.04.17.
 */
public class TextParser extends AbstractParser {
    private final static String PARAGRAPH_REGEXP = "";

    public TextParser() {
        parser = new ParagraphParser();
    }

    @Override
    public AbstractComponent parse(String data) {
        Pattern pattern = Pattern.compile(PARAGRAPH_REGEXP);
        Matcher matcher = pattern.matcher(data);

        AbstractComponent text = new Component(ComponentType.TEXT);
        AbstractComponent paragraph;

        while(matcher.find()){
            paragraph = parser.parse(matcher.group());
            paragraph.setType(ComponentType.PARAGRAPH);
            text.add(paragraph);
        }

        return text;
    }

}
