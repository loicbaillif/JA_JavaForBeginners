package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex5 {
    /* https://hyperskill.org/learn/step/2281
     * *** The Lucky Ticket ***
     *
     * Paul loves to ride public transport and after receiving a ticket, he
     * immediately checks whether he got a lucky one. A ticket is considered
     * a lucky one if the sum of the first three numbers of this ticket
     * matches the sum of the last three numbers.
     *
     * However, Paul does not count well in his head. That is why he asks you
     * to write a program which will check the equality of the sums and
     * display "Lucky" if the sums match, and "Regular" if the sums differ.
     *
     * A string of six digits is provided as input to the program.
     */

    public static void main() {
        Print.title("Processing Strings - Exercise: The lucky ticket");

        Scanner scanner = new Scanner(System.in);
        int ticketNumber = scanner.nextInt();
        int first3Digits = ticketNumber / 1000;
        int last3Digits = ticketNumber % 1000;

        Print.subtitle("End of exercise");
    }
}
