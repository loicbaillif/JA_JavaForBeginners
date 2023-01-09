package com.loicbaillif.amazingNumbers;

class CheckInput {

    static long strToLong(String input, String errorMessage) {
        return strToLong(input, errorMessage, Long.MIN_VALUE);
    }

    static long strToLong(String input, String errorMessage, long minValue) {
        // minValue is excluded
        long inputLong = minValue;
        try {
            inputLong = Long.parseLong(input);
        } catch (NumberFormatException e) {
            System.out.println(errorMessage);
        }

        if (minValue != Long.MIN_VALUE && inputLong <= minValue) {
            System.out.println(errorMessage);
            inputLong = minValue - 1;
        }

        return inputLong;
    }
}
