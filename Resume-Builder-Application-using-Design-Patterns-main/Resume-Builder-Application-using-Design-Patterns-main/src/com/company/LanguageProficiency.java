package com.company;

public class LanguageProficiency implements Component{

    String langProf;

    public LanguageProficiency(String langProf) {
        this.langProf = langProf;
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
        return langProf;
    }
}
