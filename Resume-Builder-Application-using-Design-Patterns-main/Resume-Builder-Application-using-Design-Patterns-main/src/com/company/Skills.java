package com.company;

public class Skills implements Component{
    String skills;

    public Skills(String skills) {
        this.skills = skills;
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
        return skills;
    }
}
