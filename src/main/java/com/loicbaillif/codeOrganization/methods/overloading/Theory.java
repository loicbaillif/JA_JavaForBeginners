package com.loicbaillif.codeOrganization.methods.overloading;

import com.loicbaillif.tools.Print;

import java.util.Objects;

public class Theory {
    public static void main() {
        Print.title("Theory - Overloading", '-', (byte) 70);

        Print.subtitle("1) How to overload methods");
        System.out.println("Few examples:");
        System.out.println("First implementation of method");
        printEx1("Veni, Vidi, Vici");
        System.out.println("Second implementation of method");
        printEx1(8, "Veni, Vidi, Vici");
        System.out.println("Third implementation of method");
        printEx1("Veni, Vidi, Vici", 8);

        Print.subtitle("2) Overloading and casting");
        printEx2(33);
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

    public static void printEx2(short myNumber) {
        System.out.printf("short argument: %d", myNumber);
    }

//    public static void printEx2(int myNumber) {
//        System.out.printf("int argument: %d", myNumber);
//    }

//    public static void printEx2(long myNumber) {
//        System.out.printf("long argument: %d", myNumber);
//    }

    public static void printEx2(double myNumber) {
        System.out.printf("double argument: %f", myNumber);
    }
}
