package com.loicbaillif.amazingNumbers;

class ProjectNumber {
    /* ProjectNumber as an object
     *
     * Properties:
     * even, odd, buzz, duck, gapful, palindromic and spy.
     */

    // Properties
    boolean buzz;
    boolean duck;
    boolean even;
    boolean gapful;
    boolean odd;
    boolean palindromic;
    boolean spy;
    boolean square;
    boolean sunny;
    long numberValue;

    public ProjectNumber(long numberValue) {
        this.numberValue = numberValue;
        setProperties();
    }

    // Getters and Setters
    long getNumberValue() {
        return this.numberValue;
    }
    boolean isBuzz() {
        return buzz;
    }
    boolean isDuck() {
        return duck;
    }
    boolean isEven() {
        return even;
    }
    boolean isGapful() {
        return gapful;
    }
    boolean isOdd() {
        return odd;
    }
    boolean isPalindromic() {
        return palindromic;
    }
    boolean isSpy() {
        return spy;
    }
    boolean isSquare() {
        return square;
    }
    boolean isSunny() {
        return sunny;
    }

    void setBuzz() {
        this.buzz = endsByX(numberValue, 7) || multipleOf7(numberValue);
    }
    void setDuck() {
        boolean isDuck = false;
        long remainingDigit = numberValue;

        while (!isDuck && remainingDigit != 0) {
            isDuck = endsByX(remainingDigit, 0);
            remainingDigit /= 10;
        }

        this.duck = isDuck;
    }
    void setEven() {
        this.even = (numberValue % 2 == 0);
    }
    void setGapful() {
        this.gapful = false;
        if (numberValue > 99L) {
            long divider = firstDigit() * 10L + lastDigit();
            this.gapful = (numberValue % divider == 0);
        }
    }
    void setNumberValue(long numberValue) {
        this.numberValue = numberValue;
    }
    void setOdd() {
        this.odd = (numberValue % 2 == 1);
    }
    void setPalindromic() {
        // Variables
        boolean isPalindromic = true;
        String numberString = String.valueOf(numberValue);
        int index = 0;
        int numberLength = numberString.length();
        char firstChar;
        char lastChar;

        // Processing
        while (isPalindromic && index < (numberLength / 2)) {
            firstChar = numberString.charAt(index);
            lastChar = numberString.charAt(numberLength - index - 1);
            isPalindromic = (firstChar == lastChar);
            index++;
        }

        this.palindromic = isPalindromic;
    }
    void setSpy() {
        // Variables
        String numberValueString = String.valueOf(numberValue);
        int digit;
        int nbDigits = numberValueString.length();
        long sumDigits = 0L;
        long productDigits = 1L;

        for (int i = 0; i < nbDigits; i++) {
            digit = Character.getNumericValue(numberValueString.charAt(i));
            sumDigits += digit;
            productDigits *= digit;
        }

        this.spy = (sumDigits == productDigits);
    }
    void setSquare() {
        this.square = false;
    }
    void setSunny() {
        this.sunny = false;
    }
    void setProperties() {
        setBuzz();
        setDuck();
        setEven();
        setOdd();
        setPalindromic();
        setGapful();
        setSpy();
    }


    // Methods
    private static boolean endsByX(long userInput, int digit) {
        // This method returns true if userInput ends with digit X,
        // and returns false elsewhere;

        return (userInput % 10 == digit);
    }
    private int firstDigit() {
        long tempNumber = this.getNumberValue() / 10L;
        while (tempNumber > 9L) {
            tempNumber /= 10;
        }
        return (int) tempNumber;
    }
    void giveShortStatus() {
        System.out.printf("%d is ", numberValue);
        System.out.printf(even? "even": "odd");
        System.out.printf(buzz? ", buzz": "");
        System.out.printf(duck? ", duck": "");
        System.out.printf(palindromic? ", palindromic": "");
        System.out.printf(gapful? ", gapful": "");
        System.out.printf(spy? ", spy": "");
        System.out.println();
    }
    void giveStatus(String statusPhrase) {
        System.out.printf(statusPhrase,
                this.getNumberValue(),
                this.isEven(),
                this.isOdd(),
                this.isBuzz(),
                this.isDuck(),
                this.isPalindromic(),
                this.isGapful(),
                this.isSpy(),
                this.isSquare(),
                this.isSunny());
    }
    private int lastDigit() {
        return (int) (this.getNumberValue() % 10L);
    }

    private static boolean multipleOf7(long userInput) {
        // This method returns false if userInput is not divisible by 7,
        // and returns true elsewhere;
        if (userInput < 10) {
            return (userInput == 0 || userInput == 7);
        } else {
            // Variables
            int lastDigit = (int) (userInput % 10);
            long prefix = userInput / 10;

            return multipleOf7(Math.abs(prefix - ( 2 * lastDigit)));
        }
    }
}
