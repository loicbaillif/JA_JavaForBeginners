package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex1 {
    /* https://hyperskill.org/learn/step/2702
     *
     * Write a program that reads a temperature in Celsius (°C) and shows
     * its equivalent in Fahrenheit (°F).
     *
     * Use the following formula:
     *      F = C * 1.8 + 32
     * where C is a temperature in Celsius and F is the corresponding
     * temperature in Fahrenheit.
     */
    public static void main() {
        Print.title("Floating - Exercise: Celsius to Fahrenheit",
                '*', (byte) 70);

        Scanner scanner = new Scanner(System.in);
        double tempCelsius = scanner.nextDouble();
        double tempFahr = tempCelsius * 1.8 + 32;
        System.out.println(tempFahr);

        Print.subtitle("End of exercise");
    }
}
