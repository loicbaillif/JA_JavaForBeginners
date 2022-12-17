package com.loicbaillif.addInst.ess.stand.math;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Math library: theory");

        Print.subtitle("1) Basic and rounding methods");
        System.out.println("***** Math.min():");
        System.out.printf("\tMath.min(14, 42) = %d%n", Math.min(14, 42));
        System.out.printf("\tMath.min(-13, -37) = %d%n", Math.min(-13, -37));

        System.out.println("***** Math.abs():");
        System.out.printf("\tMath.abs(3 - 5) = %d%n", Math.abs(3 - 5));
        System.out.println("\tMath.abs(-12.3) = " + Math.abs(-12.3));

        System.out.println("***** Math.floor():");
        System.out.println("\tMath.floor(12.3) = " + Math.floor(12.3));
        System.out.println("\tMath.floor(-3.2) = " + Math.floor(-3.2));

        System.out.println("***** Math.ceil():");
        System.out.println("\tMath.ceil(12.3) = " + Math.ceil(12.3));
        System.out.println("\tMath.ceil(-3.2) = " + Math.ceil(-3.2));


        Print.subtitle("2) Exponential functions");
        System.out.println("***** Math.sqrt():");
        System.out.println("\tMath.sqrt(25) = " + Math.sqrt(25));
        System.out.println("\tMath.sqrt(2.25) = " + Math.sqrt(2.25));
        System.out.println("***** Math.cbrt():");
        System.out.println("\tMath.cbrt(27) = " + Math.cbrt(27));
        System.out.println("\tMath.cbrt(3.375) = " + Math.cbrt(3.375));
        System.out.println("***** Math.pow():");
        System.out.println("\tMath.pow(3, 3) = " + Math.pow(3, 3));
        System.out.println("\tMath.pow(16, 0.25) = " + Math.pow(16, 0.25));


        Print.subtitle("3) Trigonometric functions");
        System.out.println("***** Math.sin()");
        System.out.println("\tMath.sin(0) = " + Math.sin(0));
        System.out.println("\tMath.sin(Math.PI/4) = " + Math.sin(Math.PI/4));
        System.out.println("\tMath.sin(Math.PI/2) = " + Math.sin(Math.PI/2));


        Print.subtitle("End of theory", '+', (byte) 80);
    }
}
