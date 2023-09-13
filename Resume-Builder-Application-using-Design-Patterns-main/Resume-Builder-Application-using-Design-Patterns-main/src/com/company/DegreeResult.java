package com.company;

public class DegreeResult implements Component{

    String degreeResult;

    public DegreeResult(String degreeResult) {
        this.degreeResult = degreeResult;
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
        return degreeResult;
    }
}
