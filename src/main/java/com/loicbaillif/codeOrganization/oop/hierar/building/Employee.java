package com.loicbaillif.codeOrganization.oop.hierar.building;

public class Employee extends Person {
    // Attributes
    int badgeNumber;

    // Constructors
    public Employee(
            String name,
            int yearOfBirth,
            String address,
            int badgeNumber) {
        super(name, yearOfBirth, address);
        this.setBadgeNumber(badgeNumber);
    }

    // Getters and Setters
    public int getBadgeNumber() {
        return this.badgeNumber;
    }
    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }
}
