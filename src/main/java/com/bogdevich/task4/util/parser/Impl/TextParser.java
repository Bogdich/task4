package com.bogdevich.task4.util.parser.Impl;

import com.bogdevich.task4.entity.composite.AbstractComponent;
import com.bogdevich.task4.entity.composite.Component;
import com.bogdevich.task4.entity.type.ComponentType;
import com.bogdevich.task4.util.parser.AbstractParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by Adrienne on 25.04.17.
 */
public class TextParser extends AbstractParser {
    private static final Logger LOGGER = LogManager.getLogger();

//    private final static String PARAGRAPH_REGEXP = "(^\\p{Blank}*[\\p{LC}\\p{Blank}\\p{P}\\p{Sm}]+\\n$)+";
    private final static String PARAGRAPH_REGEXP = "(\\\\n|^).*?(?=\\\\n|$)";

    public TextParser() {
        parser = new ParagraphParser();
    }

    @Override
    public AbstractComponent parse(String data) {
        Pattern pattern = Pattern.compile(PARAGRAPH_REGEXP, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(data);

        AbstractComponent text = new Component(ComponentType.TEXT);
        AbstractComponent paragraph;

        while(matcher.find()){
            String found = matcher.group();
            LOGGER.log(Level.DEBUG, found);
            paragraph = parser.parse(found);
            paragraph.setType(ComponentType.PARAGRAPH);
            text.add(paragraph);
        }

        return text;
    }

}
