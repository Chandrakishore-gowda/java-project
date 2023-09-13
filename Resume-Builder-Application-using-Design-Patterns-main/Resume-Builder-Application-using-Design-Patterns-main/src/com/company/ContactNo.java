package com.company;

public class ContactNo implements Component{
    String contactNo;

    public ContactNo(String contactNo) {
        this.contactNo = contactNo;
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
        return contactNo;
    }
}
