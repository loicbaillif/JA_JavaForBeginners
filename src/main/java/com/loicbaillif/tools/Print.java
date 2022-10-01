package com.loicbaillif.tools;

public class Print {
    // Constants
    final static char FILING_CHAR = '*';
    final static byte TITLE_WIDTH = 80;

    // Methods
    private static void centerText(String text, char filChar, byte textWidth) {
        // Variables
        String[] splitText = splitString(text, textWidth);

        for (String textLine: splitText) {
            byte freeSpace = (byte) (textWidth - 2 - textLine.length());
            byte prefixSize = (byte) (freeSpace / 2);
            // If text length is odd, we keep the extra character on the suffix
            byte suffixSize = (byte) (prefixSize + freeSpace % 2);
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

    public static void printXChars(char letter, byte occurrences) {
        for (int i = 0; i < occurrences; i++) {
            System.out.print(letter);
        }
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
            splitText[i] = text.substring(begChar, endChar).trim();
        }
        return splitText;
    }

    public static void subtitle(String text, char filingChar, byte lineWidth) {
        // subtitle("Hello, World", '*', (byte) 40) will produce:
        // *****         Hello, World         *****
        byte textLen = (byte) text.length();
        if (lineWidth - 10 >= text.length()) {
            byte prefixSize = (byte) ((lineWidth - textLen) / 2);
            byte suffixSize = (byte) (prefixSize + (lineWidth - textLen) % 2);
            System.out.println();
            printXChars(filingChar, (byte) 5);
            printXChars(' ', (byte) prefixSize);
            System.out.print(text);
            printXChars(' ', suffixSize);
            printXChars(filingChar, (byte) 5);
        } else {
            System.out.println(text);
        }
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

        // Line(s) with text
        centerText(text, filingChar, textWidth);

        // Last line: decoration line
        decorationLine(filingChar, textWidth);
    }
}
