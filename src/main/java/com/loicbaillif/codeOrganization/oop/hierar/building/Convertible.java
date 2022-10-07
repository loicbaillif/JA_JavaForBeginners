package com.loicbaillif.codeOrganization.oop.hierar.building;

public class Convertible extends Vehicle {
    // Attributes
    private String model = "MX-5";

    // Getters
    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return String.format("Convertible{brand=%s; nbWheels=%s; model=%s}%n",
                super.getBrand(), super.getNbWheels(), getModel()
                );
    }

    public String toString2() {
        // No confusion on method name, super. is not needed
        // It may be better for clarity to use it however.
        return String.format("Convertible{brand=%s; nbWheels=%s; model=%s}%n",
                getBrand(), getNbWheels(), getModel()
        );
    }
}
