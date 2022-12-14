package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Floating-point type: Theory", '+');

        Print.subtitle("1) Declaring and assigning values");
        System.out.println(". Some double-type variables:");
        double aDouble = 0.0;
        double bDouble = 1.0;
        double cDouble = -3.21;
        double piDouble = 3.14159;
        double dDouble = 5;
        System.out.printf("\t%f%n\t%f%n\t%f%n\t%f%n\t%f%n",
                aDouble, bDouble, cDouble, piDouble, dDouble);

        System.out.println(". Some float-type variables:");
        float aFloat = 0.0f;
        float bFloat = -3f;
        float piFloat = 3.14159265f;
        System.out.printf("\t%f%n\t%f%n\t%f%n", aFloat, bFloat, piFloat);

        System.out.println(". Lot of decimal digits value");
        float cFloat = 0.888888888888f;
        System.out.printf("\t0.888888888888f = %f%n", cFloat);

        System.out.println(". decimals with mantissa");
        double eDouble = 1.23e2;
        float dFloat = 7890e-1f;
        System.out.printf("\t1.23e2 = %f%n\t7890e-1f = %f%n", eDouble, dFloat);


        Print.subtitle("End of theory", '+', (byte) 80);
    }
}
