package com.loicbaillif.basics.strings.strBuilder;

import com.loicbaillif.tools.Print;

public class Ex3 {
    /* https://hyperskill.org/learn/step/12514
     *
     * Here you need to prepare a StringBuilder that produces all English
     * letters in uppercase (A-Z). All the letters should be separated by one
     * space, but there shouldn't be a space after the last letter.
     */

    public static void main() {
        Print.title("StringBuilder - Exercise: English Alphabet");

        StringBuilder sb = new StringBuilder();
        char startChar = 'A';
        char endChar = 'Z';

        sb.append(startChar);
        while (startChar++ != endChar) {
            sb.append(' ').append(startChar);
        }

        System.out.println(sb);

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
