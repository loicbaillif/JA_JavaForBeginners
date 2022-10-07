package com.loicbaillif.codeOrganization.oop.hierar.building;

public class Vehicle {
    // Attributes
    private String brand = "Mazda";
    private byte nbWheels = 4;

    // Getters
    protected String getBrand() {
        return this.brand;
    }

    protected byte getNbWheels() {
        return this.nbWheels;
    }

}
