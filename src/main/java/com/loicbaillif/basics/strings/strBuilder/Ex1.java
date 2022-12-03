package com.loicbaillif.basics.strings.strBuilder;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex1 {
    /* https://hyperskill.org/learn/step/23735
     *
     * *** Create an email ***
     *
     * We need to create an email name for an employee. For this, implement
     * a method that takes a String name and a String surname as an argument.
     * The method should concatenate the name, the surname, and at the end,
     * add the domain "@work.net". Return the result. It's guaranteed that
     * input strings will not be empty.
     *
     * Use StringBuilder to solve the problem.
     */

    public static void main() {
        Print.title("StringBuilder - Exercise: Create email");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();

        String completeEmail = createEmail(name, surname);

        System.out.println(completeEmail);

        Print.subtitle("End of exercise");
    }

    public static String createEmail(String name, String surname) {
        StringBuilder sb = new StringBuilder();
        sb
                .append(name)
                .append(surname)
                .append("@work.net");

        return null;
    }
}
