package com.bogdevich.task4.util.parser;

import com.bogdevich.task4.entity.composite.AbstractComponent;

import java.util.stream.Stream;

/**
 * Created by Adrienne on 24.04.17.
 */
public abstract class AbstractParser {
    protected AbstractParser parser;

    public abstract AbstractComponent parse(String data);

    protected AbstractComponent delegate(String data) {
        return parser.parse(data);
    }

}
