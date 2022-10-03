package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

public class Robot {
    // Attributes
    private String name;
    private String model;

    // Constructors
    public Robot() {
        setName("Anonymous");
        setModel("Unknown");
    }

    public Robot(String name, String model) {
        setName(name);
        setModel(model);
    }


    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
