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
        System.out.printf("\"%s\".length() = %d", sb2, sb2.length());


        Print.subtitle("End of Theory", '*', (byte) 80);
    }
}
