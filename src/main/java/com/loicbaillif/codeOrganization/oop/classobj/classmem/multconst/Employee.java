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
