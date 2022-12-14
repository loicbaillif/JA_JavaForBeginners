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
        System.out.println("\t1.23e2 = " + eDouble);
        System.out.println("\t7890e-1f = " + dFloat);

        Print.subtitle("2) Arithmetic operations");
        double fDouble = bDouble + cDouble;
        double gDouble = piDouble * dDouble;
        double hDouble = cDouble / dDouble;
        System.out.printf("%.2f + %.2f = ", bDouble, cDouble);
        System.out.println(fDouble);
        System.out.printf("%.2f * %.2f = ", piDouble, dDouble);
        System.out.println(gDouble);
        System.out.printf("%.2f / %.2f = ", cDouble, dDouble);
        System.out.println(hDouble);
        Print.subtitle("WARNING", '=', (byte) 60);
        // double iDouble = 5 / 4;
        double jDouble = 5.0 / 4;
        System.out.println("double d1 = 5 / 4 \t\t=> 1.0");
        System.out.println("double d2 = 5.0 / 4 \t=> " + jDouble);

        Print.subtitle("3) Errors during computation");
        System.out.print("3.3 / 3 = ");
        System.out.println(3.3 / 3);
        System.out.print("0.1 + 0.1 + 0.1 + 0.1 + 0.1 + ");
        System.out.print("0.1 + 0.1 + 0.1 + 0.1 + 0.1 = ");
        System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1);

        Print.subtitle("4) Reading floating-point numbers");
        System.out.println("Base = 3.3 - Height = 4.5");
        System.out.println("surface = " + triangleArea(3.3, 4.5));
        System.out.println("Base = 2.2 - Height = 4.01");
        System.out.println("surface = " + triangleArea(2.2, 4.01));




        Print.subtitle("End of theory", '+', (byte) 80);
    }


    public static double triangleArea (double base, double height) {
        return base * height / 2.0;
    }
}
