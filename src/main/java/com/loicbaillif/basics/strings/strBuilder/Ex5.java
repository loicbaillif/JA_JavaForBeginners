package com.loicbaillif.basics.strings.strBuilder;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex5 {
    /* https://hyperskill.org/learn/daily/3789
     *
     * *** Generating Passwords ***
     *
     * A password is hard to crack if it contains at least A uppercase
     * letters, at least B lowercase letters, at least C digits and consists
     * of exactly N symbols. Also, a password cannot contain two or more of
     * the same characters in a row.
     *
     * For the given numbers A, B, C, and N, you should output a password
     * that matches these requirements.
     *
     * It is guaranteed that A, B, C, and N are non-negative integers, and
     * A + B + C <= N. Keep in mind that any parameter can be equal to zero.
     * It means that it's ok if the password doesn't contain symbols
     * of such type.
     */
    public static void main() {
        Print.title("StringBuilder - Exercise: Generating Passwords");

        Scanner scanner = new Scanner(System.in);
        int aConstraint = scanner.nextInt();
        int bConstraint = scanner.nextInt();
        int cConstraint = scanner.nextInt();
        int nConstraint = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        String upperLetters = "AB";
        String lowerLetters = "ab";
        String digits = "12";

        while (aConstraint > 0) {
            sb.append(upperLetters.charAt(aConstraint-- % 2));
        }

        while (bConstraint > 0) {
            sb.append(lowerLetters.charAt(bConstraint-- % 2));
        }

        while (cConstraint > 0) {
            sb.append(digits.charAt(cConstraint-- % 2));
        }

        if (sb.length() < nConstraint) {
            sb.append('Z');
        }

        while (sb.length() < nConstraint) {
            sb.append(upperLetters.charAt(sb.length() % 2));
        }

        System.out.println(sb);

        Print.subtitle("End of exercise");
    }
}
