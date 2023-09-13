package com.company;

import java.util.ArrayList;
import java.util.Objects;

//  Defines behavior for components having children.

public class ResumeComponents implements Component {
    private String componentName;
    ArrayList<Component> resumeComponents = new ArrayList<>(); // Arraylist for storing leaf components.
    public ResumeComponents(String name) {
        this.componentName = name;
    }


    @Override
    public void addComponent(Component c) { // Adds component to arraylist.
        resumeComponents.add(c);

    }

    @Override
    public void removeComponent(Component c) { // Removes a Component from arraylist
        resumeComponents.remove(c);


    }

    @Override
    public String componentName() {
        return componentName;
    } // Returns the name of composite object.

    @Override
    public String displayComponent() { // Iterates through all the components and appends to the string.
        String resumeString="";
        for (Component c : resumeComponents) {
            if (c.componentName()!= null){
                resumeString += "\n\n" + c.componentName()+":-";
            }
            if (!Objects.equals(c.displayComponent(), null)){
                resumeString +="\n" +  c.getClass().getSimpleName()+ ": " + c.displayComponent() ;
            }
        }
        resumeString+="\n";
        return resumeString;
    }
}
