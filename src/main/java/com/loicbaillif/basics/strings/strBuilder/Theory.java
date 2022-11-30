package com.loicbaillif.basics.strings.strBuilder;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("StringBuilder");

        Print.subtitle("1) Mutable Strings");
        /*
         * For cases when a lot of String modifications will occur at run time
         * If we have to perform concatenation in a loop for instance
         * StringBuilder is a Class
         */

        Print.subtitle("2) Construct StringBuilder object");
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("Hello, World!");
        System.out.println(sb2);

        Print.subtitle("3) Some important methods");
        System.out.printf("\"%s\".length() = %d%n", sb2, sb2.length());

        System.out.printf("\"%s\".charAt(0) = %c%n", sb2, sb2.charAt(0));
        System.out.printf("\"%s\".charAt(3) = %c%n", sb2, sb2.charAt(3));
        System.out.printf("\"%s\".charAt(6) = %c%n", sb2, sb2.charAt(6));
        System.out.printf("\"%s\".charAt(9) = %c%n", sb2, sb2.charAt(9));


        Print.subtitle("End of Theory", '*', (byte) 80);
    }
}
