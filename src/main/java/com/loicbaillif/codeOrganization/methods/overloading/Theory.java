package com.loicbaillif.codeOrganization.methods.overloading;

import com.loicbaillif.tools.Print;

public class Theory {
    public static void main() {
        Print.title("Theory - Overloading", '-', (byte) 70);

        Print.subtitle("1) How to overload methods", '*', (byte) 60);
        System.out.println("Few examples:");
        System.out.println("First implementation of method");
        printEx1("Veni, Vidi, Vici");
        System.out.println("Second implementation of method");
        printEx1(8, "Veni, Vidi, Vici");
        System.out.println("Third implementation of method");
        printEx1("Veni, Vidi, Vici", 8);
    }

    public static void printEx1(String text) {
        System.out.println(text);
    }

    public static void printEx1(int nbStars, String text) {
        for (int i = 0; i < nbStars; i++) {
            System.out.print('*');
        }
        System.out.println(" " + text);
    }

    public static void printEx1(String text, int nbTimes) {
        nbTimes = Math.min(10, nbTimes);
        while (--nbTimes > 0) {
            System.out.println(text);
        }
    }
}
