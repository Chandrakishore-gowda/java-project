package com.company;

public class AboutMe implements Component{
    String about;

    public AboutMe(String about) {
        this.about = about;
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
        return about;
    }
}
