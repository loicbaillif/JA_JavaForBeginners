package com.loicbaillif.tools;

public class Print {
    // Constants
    final static char FILING_CHAR = '*';
    final static byte TITLE_WIDTH = 80;

    // Methods
    public static void title(String text) {
        // use default constants
        title(text, FILING_CHAR, TITLE_WIDTH);
    }

    public static void title(String text, char filingChar) {
        // Use default constants
        title(text, filingChar, TITLE_WIDTH);
    }

    public static void title(String text, char filingChar, byte textWidth) {
        // Empty line to separate from previous text
        System.out.println();

        // Line filled with textWidth times filingChar
        for (byte i = 0; i < textWidth; i++) {
            System.out.print(filingChar);
        }
        System.out.println();
    }
}
