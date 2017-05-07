package com.bogdevich.task4.util.parser.Impl;

import com.bogdevich.task4.entity.composite.AbstractComponent;
import com.bogdevich.task4.entity.composite.Component;
import com.bogdevich.task4.entity.type.ComponentType;
import com.bogdevich.task4.util.parser.AbstractParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Adrienne on 25.04.17.
 */
public class ParagraphParser extends AbstractParser {
    private final String SENTENCE_REGEXP = "";

    public ParagraphParser() {
        parser = new SentenceParser();
    }

    @Override
    public AbstractComponent parse(String data) {
        Pattern pattern = Pattern.compile(SENTENCE_REGEXP,Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(data);

        AbstractComponent paragraph = new Component(ComponentType.PARAGRAPH);
        AbstractComponent sentence;

        while(matcher.find()){

        }
        return null;
    }
}
