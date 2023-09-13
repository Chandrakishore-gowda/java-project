package com.company;

public class SSCResult implements Component{

    String sscresult;

    public SSCResult(String sscresult) {
        this.sscresult = sscresult;
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
        return sscresult;
    }
}
