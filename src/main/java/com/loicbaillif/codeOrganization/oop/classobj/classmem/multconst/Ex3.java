package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

import com.loicbaillif.tools.Print;

public class Ex3 {
    /* https://hyperskill.org/learn/step/3007
     * Below is a class named Phone. It has four fields:
     *          ownerName, countryCode, cityCode and number.
     *
     * Add two constructors to the class:
     *      . The first one takes ownerName and number and initializes the
     *      corresponding fields;
     *      . The second one takes ownerName, countryCode, cityCode, number
     *      and initializes all fields.
     *
     * Do not make the fields and constructors private.
     */

    public static void main() {
        Print.title("Multiple Constructors - Exercise: Phone");

        Phone phone1 = new Phone("Paul Isson", "0123456789");
        Phone phone2 = new Phone("John Doe", "1234", "53100", "0987654321");

        System.out.println(phone1);
        System.out.println(phone2);

        Print.subtitle("End of exercise");
    }
}
