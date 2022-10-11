package com.loicbaillif.codeOrganization.oop.hierar.building;

import com.loicbaillif.tools.Print;

public class Ex3 {
    /* https://hyperskill.org/learn/step/3041
     * Fiona created a hierarchy consisting of three classes:
     *      Employee, RegularEmployee and ContractEmployee.
     *
     * But here is one problem: her code doesn't compile.
     *
     * Fix the code to make it compile.
     */

    public static void main() {
        Print.title("The keyword super - Exercise: Employees");



        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}


class Employee3 {

    protected String name;
    protected String birthDate;

    public Employee3(String name, String birthDate) {
        this.name = name;  // fixed: "super" replaced by "this"
        this.birthDate = birthDate;  // fixed: "super" replaced by "this"
    }
}

class RegularEmployee extends Employee3 {

    protected long salary;
    protected String hireDate;

    public RegularEmployee(String name, String birthDate, long salary, String hireDate) {
        super(name, birthDate);  // fixed: "this" replaced by "super"
        this.salary = salary;  // fixed: "super" replaced by "this"
        this.hireDate = hireDate;
    }
}

class ContractEmployee extends Employee3 {

    protected long payPerHour;
    protected String contractPeriod;

    public ContractEmployee(String name, String birthDate, long payPerHour, String contractPeriod) {
        super(name, birthDate); // line added to fix constructor
        this.payPerHour = payPerHour;
        this.contractPeriod = contractPeriod;  // fixed: "super" replaced by "this"
    }
}
