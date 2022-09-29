package com.loicbaillif.tools;

import org.apache.commons.lang3.StringUtils;

public class Print {
    // Constants
    final static char FILING_CHAR = '*';
    final static byte TITLE_WIDTH = 80;

    // Methods
    private static void centerText(String text, char filChar, byte textWidth) {
        // Variables
        byte freeSpace = (byte) (textWidth - 2 - text.length());
        byte suffixSize = (byte) (freeSpace / 2);
        // If text length is odd, we keep the extra character on the prefix
        byte prefixSize = (byte) (suffixSize + freeSpace % 2);

        // Printing line
        System.out.print(filChar);
        for (byte i = 0; i < prefixSize; i++) {
            System.out.print(' ');
        }
        System.out.print(text);
        for (byte i = 0; i < suffixSize; i++) {
            System.out.print(' ');
        }
        System.out.println(filChar);
    }
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
        centerText(text, filingChar, textWidth);

        // Third decoration line
        decorationLine(filingChar, textWidth);
    }
}
