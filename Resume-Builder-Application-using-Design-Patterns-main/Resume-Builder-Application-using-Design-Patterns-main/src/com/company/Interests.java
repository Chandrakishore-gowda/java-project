package com.company;

public class Interests implements Component{

    String interests;

    public Interests(String interests) {
        this.interests = interests;
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
        return interests;
    }
}
