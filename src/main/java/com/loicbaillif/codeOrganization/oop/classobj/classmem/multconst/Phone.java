package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

public class Phone {
    // Attributes
    String ownerName;
    String countryCode;
    String cityCode;
    String number;

    // Constructors
    public Phone(String ownerName, String number) {
        this.ownerName = ownerName;
        this.number = number;
    }

    public Phone(
            String ownerName,
            String countryCode,
            String cityCode,
            String number) {
        this(ownerName, number);
        this.countryCode = countryCode;
        this.cityCode = cityCode;
    }

    // toString

    @Override
    public String toString() {
        return "Phone{" +
                "ownerName='" + ownerName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
