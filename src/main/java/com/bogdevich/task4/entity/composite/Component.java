package com.bogdevich.task4.entity.composite;

import com.bogdevich.task4.entity.type.ComponentType;

import java.util.ArrayList;
import java.util.ListIterator;

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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(this.getType()).append(": ").append(String.valueOf(components.size())).append("\n");
        components.forEach((component)->{
            if(ComponentType.PARAGRAPH.equals(component.getType())){
                stringBuilder.append("\t").append(component.toString()).append("\n");
            }else
                if(ComponentType.LEXEME.equals(component.getType())){
                    stringBuilder.append(component.toString()).append(" ");
                }else {
                    stringBuilder.append(component.toString());
                }
        });
        return stringBuilder.toString();
    }
}
