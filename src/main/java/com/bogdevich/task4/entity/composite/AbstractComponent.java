package com.bogdevich.task4.entity.composite;

import com.bogdevich.task4.entity.type.ComponentType;

/**
 * Created by Adrienne on 25.04.17.
 */
public abstract class AbstractComponent {
    private ComponentType type;

    public AbstractComponent(ComponentType type) {
        this.type = type;
    }

    public ComponentType getType() {
        return type;
    }
    public void setType(ComponentType type) {
        this.type = type;
    }


    public abstract void add(AbstractComponent component);
    public abstract void remove(AbstractComponent component);

    @Override
    public abstract String toString();
}
