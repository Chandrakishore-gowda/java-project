package com.company;

// implements default behavior for the interface common to all classes(Leaf and composite).

public interface Component {
    public void addComponent(Component c);
    public void removeComponent(Component c);
    public String componentName();
    public  String displayComponent();

}
