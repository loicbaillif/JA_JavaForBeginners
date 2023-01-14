package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex8 {
    // https://hyperskill.org/learn/daily/3796
    public static void main() {
        Print.title("Floating-point type - Exercise: Area of a circle");

        // Variables
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        System.out.println(Math.PI * radius * radius);

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
