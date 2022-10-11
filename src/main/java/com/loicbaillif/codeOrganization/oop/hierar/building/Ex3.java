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
        super.name = name;
        super.birthDate = birthDate;
    }
}

class RegularEmployee extends Employee3 {

    protected long salary;
    protected String hireDate;

    public RegularEmployee(String name, String birthDate, long salary, String hireDate) {
        this(name, birthDate);
        super.salary = salary;
        this.hireDate = hireDate;
    }
}

class ContractEmployee extends Employee3 {

    protected long payPerHour;
    protected String contractPeriod;

    public ContractEmployee(String name, String birthDate, long payPerHour, String contractPeriod) {
        this.payPerHour = payPerHour;
        super.contractPeriod = contractPeriod;
    }
}
