package com.bogdevich.task4.entity.composite;

import com.bogdevich.task4.entity.type.ComponentType;

/**
 * Created by Adrienne on 25.04.17.
 */
public class Symbol extends AbstractComponent{
    private char symbol;

    public Symbol() {
        super(ComponentType.SYMBOL);
    }

    public Symbol(char symbol) {
        super(ComponentType.SYMBOL);
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
        this.setType(ComponentType.SYMBOL);
    }

    @Override
    public void add(AbstractComponent component) {
        throw new UnsupportedOperationException("Class symbol doesn't support method \"add()\"");
    }

    @Override
    public void remove(AbstractComponent component) {
        throw new UnsupportedOperationException("Class symbol doesn't support method \"remove()\"");
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
