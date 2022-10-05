package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

public class Employee {
    // Attributes
    String name;
    int salary;
    String address;

    final String DEFAULT_STR = "unknown";

    // Constructors
    Employee() {
        this.name = DEFAULT_STR;
        this.salary = 0;
        this.address = DEFAULT_STR;
    }

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.address = DEFAULT_STR;
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
