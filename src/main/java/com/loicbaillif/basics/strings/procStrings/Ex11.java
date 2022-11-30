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
        String remainingString = inputUrl.substring(keyPosition + 1);
        boolean passDetected = false;
        String password = "";

        String[] keyValueArray = remainingString.split("&");
        for (String keyValue : keyValueArray) {
            if (keyValue.startsWith("pass")) {
                passDetected = true;
                password = keyValue.substring(keyValue.indexOf("=") + 1);
            }
            System.out.print(keyValue.replaceFirst("=", " : "));
            System.out.println(
                    (keyValue.indexOf('=') == keyValue.length() - 1)
                    ? emptyKey
                    : "");
        }

        if (passDetected) {
            System.out.printf("password : %s", password);
        }


        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
