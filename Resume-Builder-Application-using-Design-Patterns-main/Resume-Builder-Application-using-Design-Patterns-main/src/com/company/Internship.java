package com.company;

public class Internship implements Component{

    String internship;

    public Internship(String internship) {
        this.internship = internship;
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
        return internship;
    }
}
