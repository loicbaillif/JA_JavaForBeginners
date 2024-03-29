package com.loicbaillif.amazingNumbers;

import java.util.ArrayList;

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
    boolean happy;
    boolean jumping;
    boolean odd;
    boolean palindromic;
    boolean sad;
    boolean spy;
    boolean square;
    boolean sunny;
    long numberValue;

    public ProjectNumber(long numberValue) {
        this.numberValue = numberValue;
        //setProperties();
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
    boolean isHappy() {
        return happy;
    }
    boolean isJumping() {
        return jumping;
    }
    boolean isOdd() {
        return odd;
    }
    boolean isPalindromic() {
        return palindromic;
    }
    boolean isSad() {
        return sad;
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
    void setHappy() {
        // Variables
        ArrayList<Integer> previousValues = new ArrayList<>();
        int tempValue = sumDigitsSquare(this.getNumberValue());

        // Loop
        while (!previousValues.contains(tempValue)) {
            previousValues.add(tempValue);
            tempValue = sumDigitsSquare(tempValue);
            if (tempValue == 1) {
                this.happy = true;
                this.sad = false;
                return;
            }
        }

        // Result
        this.happy = false;
        this.sad = true;
    }
    void setJumping() {
        if (this.numberValue < 10) {
            this.jumping = true;
            return;
        }
        int temp;
        int units;
        long remaining = this.numberValue;
        while (remaining > 9) {
            units = (int) (remaining % 10);
            remaining /= 10;
            temp = (int) (remaining % 10);
            if (Math.abs(temp - units) != 1) {
                this.jumping = false;
                return;
            }
        }
        this.jumping = true;
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
    void setSad() {
        setHappy();
    }
    void setSpy() {
        // Variables
        String numberValueString = String.valueOf(numberValue);
        int digit;
        int nbDigits = numberValueString.length();
        long sumDigits = sumDigits(this.numberValue);
        long productDigits = 1L;

        for (int i = 0; i < nbDigits; i++) {
            digit = Character.getNumericValue(numberValueString.charAt(i));
            productDigits *= digit;
        }

        this.spy = (sumDigits == productDigits);
    }
    void setSquare() {
        this.square = false;
        // Variables
        int sumDigits = sumDigits(this.numberValue);
        while (sumDigits > 9) {
            sumDigits = sumDigits(sumDigits);
        }

        if (sumDigits == 1 || sumDigits == 4 || sumDigits == 7 || sumDigits == 9) {
            // Sum of digits for a square number cannot be else than 1 4 7 or 9
            long root = (long) Math.sqrt(this.numberValue);
            this.square = ((root * root) == this.numberValue);
        }
    }
    void setSunny() {
        ProjectNumber tempNumber = new ProjectNumber(this.numberValue + 1);
        tempNumber.setSquare();
        this.sunny = tempNumber.isSquare();
    }
    void setProperties() {
        setBuzz();
        setDuck();
        setEven();
        setGapful();
        setHappy();
        setJumping();
        setOdd();
        setPalindromic();
        setSad();
        setSpy();
        setSquare();
        setSunny();
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
        System.out.printf(gapful? ", gapful": "");
        System.out.printf(happy? ", happy": "");
        System.out.printf(jumping? ", jumping": "");
        System.out.printf(palindromic? ", palindromic": "");
        System.out.printf(sad? ", sad": "");
        System.out.printf(spy? ", spy": "");
        System.out.printf(square? ", square": "");
        System.out.printf(sunny? ", sunny": "");
        System.out.println();
    }
    void giveStatus(String statusPhrase) {
        System.out.printf(statusPhrase,
                this.getNumberValue(),
                this.isBuzz(),
                this.isDuck(),
                this.isEven(),
                this.isGapful(),
                this.isHappy(),
                this.isJumping(),
                this.isOdd(),
                this.isPalindromic(),
                this.isSad(),
                this.isSpy(),
                this.isSquare(),
                this.isSunny());
    }
    private int lastDigit() {
        return (int) (this.getNumberValue() % 10L);
    }
    private int sumDigits(long userInput) {
        // Variables
        String userInputString = String.valueOf(userInput);
        int digit;
        int nbDigits = userInputString.length();
        int sumDigits = 0;

        for (int i = 0; i < nbDigits; i++) {
            digit = Character.getNumericValue(userInputString.charAt(i));
            sumDigits += digit;
        }

        return sumDigits;
    }
    private int sumDigitsSquare(long inputValue) {
        // Variables
        int result = 0;
        long temp = inputValue;
        int lastDigit = (int) (temp % 10);

        while (temp > 0L) {
            result += lastDigit * lastDigit;
            temp /= 10;
            lastDigit = (int) (temp % 10);
        }

        return result;
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
