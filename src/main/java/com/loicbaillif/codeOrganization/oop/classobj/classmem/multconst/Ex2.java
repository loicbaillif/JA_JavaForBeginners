package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

import com.loicbaillif.tools.Print;

public class Ex2 {
    /* https://hyperskill.org/learn/step/3006
     * Here's a class named Employee with three fields: name, salary, address.
     *
     * Add three constructors to the class:
     *      . The first one is the no-argument constructor, it should
     *      initialize string fields with the value "unknown",
     *      the salary is 0;
     *      . The second one takes name and salary, and then initializes the
     *      corresponding fields, the address is "unknown";
     *      . The third one takes name, salary, address and initializes
     *      all fields.
     *
     * Do not make the fields and constructors private.
     */

    public static void main() {
        Print.title("Multiple Constructors - Exercise: Employee");

        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Tom Hato", 32123);
        Employee employee3 = new Employee(
                "Pat Hato",
                97531,
                "St. Ardom, Paris");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
