package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex11 {
    /* https://hyperskill.org/learn/step/3660
     *
     *  *** Parse URL ***
     * You want to hack a website now. First, get all the available parameters
     * that you can find in the URL. Then print them in the "key : value"
     * format. If a parameter doesn't have value, print "not found".
     *
     * If you find the password (parameter pass), you should print its value
     * after all parameters once again, but with a key password. If a URL does
     * not contain parameter pass, do not print anything after the listed
     * parameters. However, if pass parameter is present, its value cannot
     * be empty.
     */

    public static void main() {
        Print.title("Processing Strings - Exercise: Parse URL");

        Scanner scanner = new Scanner(System.in);
        String inputUrl = scanner.nextLine();
        int keyPosition = inputUrl.indexOf('?');
        String emptyKey = "not found";
        int valuePosition;
        String remainingString = inputUrl.substring(keyPosition + 1);

        String[] keyValueArray = remainingString.split("&");
        for (String keyValue : keyValueArray) {
            System.out.print(keyValue.replaceFirst("=", " : "));
            System.out.println(
                    (keyValue.indexOf('=') == keyValue.length() - 1)
                    ? emptyKey
                    : "");
        }

        /*
        while (keyPosition > 0) {
            keyPosition = remainingString.indexOf('&');
            valuePosition = remainingString.indexOf('=');
            System.out.println(remainingString);

            System.out.print(remainingString.substring(0, valuePosition));
            System.out.print(" : ");
            if (keyPosition == valuePosition + 1) {
                System.out.println(emptyKey);
            } else {
                System.out.println(remainingString.substring(
                        valuePosition + 1,
                        keyPosition > 0 ?
                ));
            }
            System.out.println(
                    keyPosition == valuePosition + 1
                    ? emptyKey
                    : remainingString.substring(valuePosition + 1, keyPosition));

            remainingString = remainingString.substring(keyPosition + 1);

        } */



        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
