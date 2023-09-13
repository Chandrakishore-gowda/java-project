package com.company;

public class DateOfBirth implements Component{
    String dob;

    public DateOfBirth(String dob) {
        this.dob = dob;
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
        return dob;
    }
}
