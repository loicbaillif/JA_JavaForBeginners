package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex2 {
    /* https://hyperskill.org/learn/step/2182
     *
     * Write a program that reads the distance between two cities in miles
     * and the travel time by bus in hours and outputs
     * the average speed of the bus.
     */
    public static void main() {
        Print.title("Floating - Exercise: Distance");

        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        double duration = scanner.nextDouble();


        Print.subtitle("End of exercise");
    }
}
