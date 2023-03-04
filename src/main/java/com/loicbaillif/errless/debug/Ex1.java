package com.loicbaillif.errless.debug;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex1 {
    // https://hyperskill.org/learn/step/13782
    public static void main() {
        Print.title("Exercise - Find the error");

        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[2];
        ints[0] = Integer.parseInt(scanner.nextLine());
        ints[1] = Integer.parseInt(scanner.nextLine());

        ints = swapInts(ints);

        System.out.println(ints[0]);
        System.out.println(ints[1]);



        Print.subtitle("End of exercise", '*', (byte) 80);
    }


    public static int[] swapInts(int[] ints) {
        return new int[]{ints[1], ints[0]};
    }
}
