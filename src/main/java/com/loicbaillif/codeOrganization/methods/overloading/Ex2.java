package com.loicbaillif.codeOrganization.methods.overloading;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex2 {
    public static void main() {
        Print.subtitle("Overloading - Exercise: Print");

        /* https://hyperskill.org/learn/step/2247
         * There is a method print(String arg). The method outputs the name
         * and its argument (in " ", as it's a string). The output format for
         * the string argument "test" is:
         *      print("test")
         *
         * Overload this method by writing a new method with the same name and
         * two arguments: a string and an integer. The new method should print
         * the name and both parameters, like this:
         *      print("test", 4)
         * Do not remove the existing method!
         */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);

        Print.subtitle("End of exercise");
    }

    public static void print(String text) {
        System.out.printf("print(\"%s\")%n", text);
    }

    public static void print(String text, int occurrences) {
        System.out.printf("print(\"%s\", %d)%n", text, occurrences);
    }
}
