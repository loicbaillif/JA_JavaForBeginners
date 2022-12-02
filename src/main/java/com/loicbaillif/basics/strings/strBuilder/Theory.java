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
        @SuppressWarnings("StringBufferReplaceableByString")
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("Hello, World!");
        System.out.println(sb2);

        Print.subtitle("3) Some important methods");
        System.out.printf("\"%s\".length() = %d%n", sb2, sb2.length());

        System.out.printf("%n\"%s\".charAt(0) = %c%n", sb2, sb2.charAt(0));
        System.out.printf("\"%s\".charAt(3) = %c%n", sb2, sb2.charAt(3));
        System.out.printf("\"%s\".charAt(6) = %c%n", sb2, sb2.charAt(6));
        System.out.printf("\"%s\".charAt(9) = %c%n", sb2, sb2.charAt(9));

        sb2.setCharAt(12, '?');
        System.out.printf(
                "%n\"Hello, World!\".setCharAt(12, '?') => %n\t%s%n",
                sb2);

        System.out.printf("%n\"%s\"", sb2);
        sb2.deleteCharAt(4);
        System.out.printf(".deleteCharAt(12, 4) => %n\t%s%n", sb2);

        System.out.printf("%n\"%s\"", sb2);
        sb2.append(" Heaven, Sky!");
        System.out.printf(".append(\" Heaven, Sky!\") => %n\t%s%n", sb2);
        @SuppressWarnings("StringBufferReplaceableByString")
        StringBuilder sb3 = new StringBuilder();
        sb3
                .append("There is nothing ")
                .append("either good or bad, ")
                .append("but thinking ")
                .append("makes it so");
        System.out.println(sb3);

        System.out.printf("%n\"%s\"", sb2);
        sb2.insert(13, "I would rather say ... ");
        System.out.printf(
                ".insert(13, \"I would rather say ... \") => %n\t%s%n",
                sb2
        );

        System.out.printf("%n\"%s\"", sb2);
        sb2.replace(15, 27, "prefer to");
        System.out.printf(
                ".replace(15, 27, \"prefer to\") => %n\t%s%n",
                sb2
        );

        System.out.printf("%n\"%s\"", sb2);
        sb2.delete(6, 41);
        System.out.printf(".delete(6, 33) => %n\t%s%n", sb2);

        System.out.printf("%n\"%s\"", sb2);
        sb2.reverse();
        System.out.printf(".reverse() =>%n\t%s%n", sb2);


        Print.subtitle("End of Theory", '*', (byte) 80);
    }
}
