package com.loicbaillif.tools;

public class Print {
    // Constants
    final static char FILING_CHAR = '*';
    final static byte TITLE_WIDTH = 80;

    // Methods
    private static void decorationLine(char filingChar, byte textWidth) {
        // Line filled with textWidth times filingChar
        for (byte i = 0; i < textWidth; i++) {
            System.out.print(filingChar);
        }
        System.out.println();
    }
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

        // First decoration line
        decorationLine(filingChar, textWidth);

        // Line with text
        System.out.println(text);

        // Third decoration line
        decorationLine(filingChar, textWidth);
    }
}
