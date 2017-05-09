package com.bogdevich.task4.util.parser.Impl;

import com.bogdevich.task4.entity.composite.AbstractComponent;
import com.bogdevich.task4.entity.composite.Component;
import com.bogdevich.task4.entity.type.ComponentType;
import com.bogdevich.task4.util.parser.AbstractParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Adrienne on 25.04.17.
 */
public class SentenceParser extends AbstractParser {
    private static final Logger LOGGER = LogManager.getLogger();

    private final String MATH_REGEXP = "[\\d+\\-*/()ij][\\d+\\-*/()ij ]{2,}";
    private final String LEXEME_REGEXP = "[\\p{LC}\\p{P}]+";

    public SentenceParser() {
        parser = new LexemeParser();
    }

    @Override
    public AbstractComponent parse(String data) {
        Pattern pattern = Pattern.compile(MATH_REGEXP+"|"+LEXEME_REGEXP);
        Matcher matcher = pattern.matcher(data);

        AbstractComponent sentence = new Component(ComponentType.SENTENCE);
        AbstractComponent lexeme;

        while(matcher.find()){
            String part = matcher.group();
            if(part.matches(MATH_REGEXP)){
                LOGGER.log(Level.DEBUG, part);
                lexeme = parser.parse(part);
                lexeme.setType(ComponentType.EXPRESSION);
                sentence.add(lexeme);
            }else
            if(part.matches(LEXEME_REGEXP)){
                LOGGER.log(Level.DEBUG, part);
                lexeme = parser.parse(part);
                lexeme.setType(ComponentType.LEXEME);
                sentence.add(lexeme);
            }

        }

        return sentence;
    }
}
