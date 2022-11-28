package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

public class Ex10 {
    /* https://hyperskill.org/learn/step/2292
     *
     * *** Compression algorithm ***
     * Upon learning that DNA is not a random string, freshmen of the
     * Bioinformatics Institute from the informatics group suggested using a
     * compression algorithm that compresses repeated characters in a string.
     *
     * Encoding is performed as follows:
     * The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the
     * groups of the same characters of the input string are replaced by the
     * symbol and the number of its repetitions in this string.
     *
     * Write a program, which reads the string, encodes it by this algorithm
     * and outputs the encoded sequence. The encoding must be case-sensitive.
     *
     * Note, string can contain only a single character.
     */
    public static void main() {
        Print.title("Processing Strings - Exercise: Compression algorithm");



        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
