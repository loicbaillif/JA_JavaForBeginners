package com.loicbaillif.errless.except.excHandling;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Theory - Exception Handling", '+');

        Print.subtitle("1) try-catch statement");
        try {
            // Code which might raise an exception
            System.out.println("I might raise an exception");
            int c = 3 / 1;
            System.out.println("I raised no exception");
        } catch (Exception e) {
            // Code to deal with the exception
            System.out.println("I am executed because of an exception");
        }
        System.out.println("try-catch block finished");

        Print.subtitle("2) Getting info about an exception");
        try {
            double d = 2 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Print.subtitle("End of Theory", '+', (byte) 80);
    }
}
