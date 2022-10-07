package com.loicbaillif.codeOrganization.oop.hierar.building;

public class Person {
    // Attributes
    private int yearOfBirth;
    private String address;
    private String name;


    // Constructor
    public Person(String name, int yearOfBirth, String address) {
        this.setName(name);
        this.setYearOfBirth(yearOfBirth);
        this.setAddress(address);
    }


    // Getters and Setters
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
