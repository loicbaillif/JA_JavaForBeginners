package com.loicbaillif.tools;

import org.apache.commons.lang3.StringUtils;

public class Print {
    // Constants
    final static char FILING_CHAR = '*';
    final static byte TITLE_WIDTH = 80;

    // Methods
    private static void centerText(String text, char filChar, byte textWidth) {
        // Variables
        int nbLines = 1 + text.length() / (textWidth - 4);
        String[] splitText = splitString(text, textWidth);

        for (int j = 0; j < nbLines; j++) {
            String textLine = splitText[j];
            byte freeSpace = (byte) (textWidth - 2 - textLine.length());
            byte suffixSize = (byte) (freeSpace / 2);
            // If text length is odd, we keep the extra character on the prefix
            byte prefixSize = (byte) (suffixSize + freeSpace % 2);

            // Printing line
            System.out.print(filChar);
            for (byte i = 0; i < prefixSize; i++) {
                System.out.print(' ');
            }
            System.out.print(textLine);
            for (byte i = 0; i < suffixSize; i++) {
                System.out.print(' ');
            }
            System.out.println(filChar);

        }

    }
    private static void decorationLine(char filingChar, byte textWidth) {
        // Line filled with textWidth times filingChar
        for (byte i = 0; i < textWidth; i++) {
            System.out.print(filingChar);
        }
        System.out.println();
    }

    private static String[] splitString(String text, byte textWidth) {
        // Each line displays textWidth characters.
        // Text line first and last characters are decorative
        // Text line second and second to last characters are blank space
        // Text line consequently can display (textWidth - 4) chars of text
        int textLength = text.length();
        byte charsPerLine = (byte) (textWidth - 4);
        byte nbLines = (byte) (1 + textLength / charsPerLine);
        String[] splitText = new String[nbLines];
        for (byte i = 0; i < nbLines; i++) {
            int begChar = i * charsPerLine;
            int endChar = Math.min(textLength, (i + 1) * charsPerLine);
            splitText[i] = text.substring(begChar, endChar);
        }
        return splitText;
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
