package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

public class Robot {
    // Attributes
    private String name;
    private String model;
    private int lifetime;

    // Constructors
    public Robot() {
        setName("Anonymous");
        setModel("Unknown");
    }

    public Robot(String name, String model) {
        this(name, model, 42);
    }

    public Robot(String name, String model, int lifetime) {
        setName(name);
        setModel(model);
        setLifetime(lifetime);
        System.out.println("Third constructor invoked");
        System.out.println(this);
    }


    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    // toString
    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", lifetime='" + lifetime + '\'' +
                '}';
    }
}
