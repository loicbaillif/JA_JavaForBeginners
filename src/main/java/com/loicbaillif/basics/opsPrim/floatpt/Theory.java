package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Floating-point type: Theory", '+');

        Print.subtitle("1) Declaring and assigning values");
        System.out.println("Some double-type variables:");
        double aDouble = 0.0;
        double bDouble = 1.0;
        double cDouble = -3.21;
        double piDouble = 3.14159;
        double dDouble = 5;
        System.out.printf("\t%f%n\t%f%n\t%f%n\t%f%n\t%f%n",
                aDouble, bDouble, cDouble, piDouble, dDouble);

        System.out.println("Some float-type variables:");
        float aFloat = 0.0f;
        float bFloat = -3f;
        float piFloat = 3.14159265f;
        System.out.printf("\t%f%n\t%f%n\t%f%n", aFloat, bFloat, piFloat);


        Print.subtitle("End of theory", '+', (byte) 80);
    }
}
