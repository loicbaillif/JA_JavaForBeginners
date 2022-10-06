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
        this.ownerName = ownerName;
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.number = number;
    }
}
