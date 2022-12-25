package com.loicbaillif.errless.except.excHandling;

import com.loicbaillif.tools.Print;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

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

        Print.subtitle("3) Catching multiple exceptions");
        try {
            Scanner s2 = new Scanner(new File("file.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception caught");
        } catch (Exception e) {
            System.out.println("General exception caught");
        }

        Print.subtitle("4) finally block");
        try {
            System.out.println("Inside the try block");
            Integer.parseInt("12a");
        } catch (ArithmeticException e) {
            System.out.println("This is an arithmetic exception");
        } catch (Exception e) {
            System.out.println("General exception caught");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        } finally {
            System.out.println("Exception or not, finally is executed");
        }

        Print.subtitle("End of Theory", '+', (byte) 80);
    }
}
