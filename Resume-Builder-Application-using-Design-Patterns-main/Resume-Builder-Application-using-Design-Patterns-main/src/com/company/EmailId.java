package com.company;

public class EmailId implements Component{
    String email;

    public EmailId(String email) {
        this.email = email;
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
        return email;
    }
}
