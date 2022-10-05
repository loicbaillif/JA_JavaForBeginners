package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

public class Employee {
    // Attributes
    String name;
    int salary;
    String address;

    // Constructors
    Employee() {
        this.name = "unknown";
        this.salary = 0;
        this.address = "unknown";
    }

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.address = "unknown";
    }
}
