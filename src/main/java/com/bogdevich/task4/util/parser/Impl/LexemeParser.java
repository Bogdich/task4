package com.bogdevich.task4.util.parser.Impl;

import com.bogdevich.task4.entity.composite.AbstractComponent;
import com.bogdevich.task4.entity.composite.Component;
import com.bogdevich.task4.entity.composite.Symbol;
import com.bogdevich.task4.entity.type.ComponentType;
import com.bogdevich.task4.util.parser.AbstractParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Adrienne on 25.04.17.
 */
public class LexemeParser extends AbstractParser {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public AbstractComponent parse(String data) {

        AbstractComponent lexeme = new Component(ComponentType.LEXEME);
        for (char character:
             data.toCharArray()) {
            lexeme.add(new Symbol(character));
        }
        return lexeme;
    }
}
