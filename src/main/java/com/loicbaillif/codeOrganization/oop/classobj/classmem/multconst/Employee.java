package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

public class Employee {

    final String defaultString = "unknown";

    // Attributes
    String name = defaultString;
    int salary = 0;
    String address = defaultString;

    // Constructors
    Employee() {
    }

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    // toString

    @Override
    public String toString() {
        return String.format(
                "Employee{name=%s, salary=%d€, address=%s}%n",
                this.name, this.salary, this.address);
    }
}
