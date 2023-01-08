package com.loicbaillif.amazingNumbers;

class CheckInput {

    static long stringToLong(String input, String errorMessage) {
        long inputLong = -1L;
        try {
            inputLong = Long.parseLong(input);
        } catch (NumberFormatException e) {
            System.out.println(errorMessage);
        }

        return inputLong;
    }
}
