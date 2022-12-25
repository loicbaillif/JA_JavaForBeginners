package com.loicbaillif.errless.except.excHandling;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Theory - Exception Handling", '+');

        Print.subtitle("1) try-catch statement");
        try {
            // Code which might raise an exception
            System.out.println("I might raise an exception");
            int c = 3 / 0;
        } catch (Exception e) {
            // Code to deal with the exception
            System.out.println("I am executed because of an exception");
        }

        Print.subtitle("End of Theory", '+', (byte) 80);
    }
}
