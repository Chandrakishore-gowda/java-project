package com.company;

public class Name implements Component{
    String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public void addComponent(Component c) {

    }

    @Override
    public void removeComponent(Component c) {

    }

    @Override
    public String componentName() {
        return null;
    }

    @Override
    public String displayComponent() {
        return name;
    }
}
