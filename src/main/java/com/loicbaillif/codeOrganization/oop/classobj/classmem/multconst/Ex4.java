package com.loicbaillif.codeOrganization.oop.classobj.classmem.multconst;

import com.loicbaillif.tools.Print;

public class Ex4 {
    /* https://hyperskill.org/learn/step/2174
     * You are given a class named Movie. Write two constructors for the class.
     *
     * The first constructor should take three arguments (title, desc, year)
     * and initialize the corresponding fields.
     *
     * The second one should take only two arguments (title, year) and
     * initialize title and year. In this case, the field desc should have
     * a value "empty".
     */

    public static void main() {
        Print.title("Multiple Constructors - Exercise: Movie");



        Print.subtitle("End of exercise", '*', (byte)80);
    }
}


class Movie {
    private String title;
    private String desc;
    private int year;

    // write two constructors here

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}
