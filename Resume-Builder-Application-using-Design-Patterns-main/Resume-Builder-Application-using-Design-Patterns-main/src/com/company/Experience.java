package com.company;

public class Experience implements Component{

    String experience;

    public Experience(String experience) {
        this.experience = experience;
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
        return experience;
    }
}
