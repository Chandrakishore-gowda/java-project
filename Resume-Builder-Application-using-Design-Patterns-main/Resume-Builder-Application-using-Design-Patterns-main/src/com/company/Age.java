package com.company;


public class Age implements Component{

    String age;

    public Age(String age) {
        this.age = age;
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
        return age;
    }
}
