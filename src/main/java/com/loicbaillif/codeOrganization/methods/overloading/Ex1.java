package com.loicbaillif.codeOrganization.methods.overloading;

import com.loicbaillif.tools.Print;

public class Ex1 {
    public static void main() {
        Print.title("Overloading - Exercise: Overloading methods");

        /* https://hyperskill.org/learn/step/2753
         * Here is a method that takes a long value and returns the max value
         * of the long type minus the given number.
         *
         *  public static long getMaxMinusCurrent(long val) {
         *      return Long.MAX_VALUE - val;
         *  }
         *
         * Overload this method with one new method. The method should take an
         * int and return the max value of the int type minus the given value.
         *
         * For the method, the type of result value must be the same as the
         * type of the parameter.
         */
    }

    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }

    public static long getMaxMinusCurrent(int val) {
        return Integer.MAX_VALUE - val;
    }
}
