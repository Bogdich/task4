package com.bogdevich.task4.entity.composite;

import com.bogdevich.task4.entity.type.ComponentType;

import java.util.ArrayList;

/**
 * Created by Adrienne on 25.04.17.
 */
public class Component extends AbstractComponent {

    private ArrayList<AbstractComponent> components;

    public Component(ComponentType type) {
        super(type);
        components = new ArrayList<>();
    }


    @Override
    public void add(AbstractComponent component) {
        components.add(component);
    }

    @Override
    public void remove(AbstractComponent component) {
        components.remove(component);
    }
}
