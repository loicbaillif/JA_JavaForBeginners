package com.loicbaillif.addInst.ess.stand.math;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Math library: theory");

        Print.subtitle("1) Basic and rounding methods");
        System.out.println("***** Math.min:");
        System.out.printf("\tMath.min(14, 42) = %d%n", Math.min(14, 42));
        System.out.printf("\tMath.min(-13, -37) = %d%n", Math.min(-13, -37));

        Print.subtitle("End of theory", '+', (byte) 80);
    }
}
