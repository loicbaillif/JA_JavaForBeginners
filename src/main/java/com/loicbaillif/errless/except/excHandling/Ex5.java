package com.loicbaillif.errless.except.excHandling;

import com.loicbaillif.tools.Print;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    /* https://hyperskill.org/learn/daily/2479
     *
     * Exception Handling - Exercise : Catching some exceptions
     */

    // Code to update:
    public static void methodCatchingSomeExceptions() {
        // invoke methodThrowingExceptions here and catch some types of exceptions
        Print.title("Exception Handling : Exercise 5");

        try {
            methodThrowingExceptions();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }


        Print.subtitle("End of exercise", '*', (byte) 80);
    }



    // static variables
    private static String array = null;

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        array = scanner.nextLine();
        try {
            methodCatchingSomeExceptions();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getName());
        }
    }


    public static void methodThrowingExceptions() {
        if (array == null) {
            return;
        }
        int[] integers = Arrays.stream(array.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Object someValue = integers[integers[0]];
        if (integers[0] + integers[1] == integers[2]) {
            integers = null;
        }
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }
        int meanValue = integers.length / sum;
        if (integers[2] == integers[3]) {
            String string = (String) someValue;
            System.out.print("Random value is " + string);
        }
        System.out.print("Mean is " + meanValue);
    }


    // Code to update:

}
