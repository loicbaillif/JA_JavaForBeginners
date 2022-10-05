package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

import com.loicbaillif.tools.Print;

public class Ex1 {

    /* https://hyperskill.org/learn/step/3005
     * Here's a class named Time with three fields:
     *      hours, minutes and seconds.
     * Add three constructors to the class:
     *      . The first one takes only hours and initializes this field;
     *      . The second one takes hours and minutes and initializes the
     *      corresponding fields;
     *      . The third one takes hours, minutes and seconds and
     *      initializes all fields.
     *
     * Do not make the fields and constructors private.
     */

    public static void main() {
        Print.title("Multiple Constructors - Exercise: Time");

        Time time1 = new Time(22);
        Time time2 = new Time(15, 34);
        Time time3 = new Time(7, 51, 22);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }
}
