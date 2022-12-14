package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Floating-point type: Theory", '+');

        Print.subtitle("1) Declaring and assigning values");
        double aDouble = 0.0;
        double bDouble = 1.0;
        double cDouble = -3.21;
        double piDouble = 3.14159;
        double dDouble = 5;
        System.out.printf("\t%f%n\t%f%n\t%f%n\t%f%n\t%f%n",
                aDouble, bDouble, cDouble, piDouble, dDouble);



        Print.subtitle("End of theory", '+', (byte) 80);
    }
}
