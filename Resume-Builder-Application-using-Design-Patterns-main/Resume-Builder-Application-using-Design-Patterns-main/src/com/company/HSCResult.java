package com.company;

public class HSCResult implements Component{
    public HSCResult(String hscresult) {
        this.hscresult = hscresult;
    }

    String hscresult;


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
        return hscresult;
    }
}
