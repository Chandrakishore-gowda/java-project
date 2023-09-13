package com.company;

public class Hobbies implements Component{

    public String hobbies;

    public Hobbies(String hobbies) {
        this.hobbies = hobbies;
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
        return hobbies;
    }

}
