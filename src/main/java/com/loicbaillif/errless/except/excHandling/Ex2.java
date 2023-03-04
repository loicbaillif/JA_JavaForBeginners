package com.loicbaillif.errless.except.excHandling;

import com.loicbaillif.tools.Print;

import java.io.FileNotFoundException;

public class Ex2 {
    /* https://hyperskill.org/learn/daily/16171
     *
     * BadRequest Exception
     *
     * Create a class named BadRequestException with the constructor that
     * takes String message as an argument and passes the message to the
     * superclass. The BadRequestException class must inherit from a
     * checked exception.
     */
    public static void main() {
        Print.title("Exception Handling - Exercise: String to double");

        try {
            BadRequestException b1 = new BadRequestException("Ping");
        } catch (Exception e) {
            System.out.println("Error");
        }


        Print.subtitle("End of exercise", '+', (byte) 80);
    }
}



class BadRequestException extends FileNotFoundException {
    public BadRequestException (String message) {
        super(message);
    }
}


