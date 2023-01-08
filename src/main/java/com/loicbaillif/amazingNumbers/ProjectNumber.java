package com.loicbaillif.amazingNumbers;

class ProjectNumber {
    /* ProjectNumber as an object
     *
     * Properties:
     * even, odd, buzz, duck and palindromic.
     */

    // Properties
    boolean buzz;
    boolean duck;
    boolean even;
    boolean odd;
    boolean palindromic;
    long numberValue;

    public ProjectNumber(long numberValue) {
        this.numberValue = numberValue;
        setEven();
        setOdd();
        setBuzz();
        setDuck();
        setPalindromic();
    }

    // Getters and Setters
    boolean isBuzz() {
        return buzz;
    }
    boolean isDuck() {
        return duck;
    }
    boolean isEven() {
        return even;
    }
    boolean isOdd() {
        return odd;
    }
    boolean isPalindromic() {
        return palindromic;
    }

    private void setBuzz() {
        this.buzz = endsByX(numberValue, 7) || multipleOf7(numberValue);
    }
    private void setDuck() {
        boolean isDuck = false;
        long remainingDigit = numberValue;

        while (!isDuck && remainingDigit != 0) {
            isDuck = endsByX(remainingDigit, 0);
            remainingDigit /= 10;
        }

        this.duck = isDuck;
    }
    private void setEven() {
        this.even = (numberValue % 2 == 0);
    }
    private void setOdd() {
        this.odd = (numberValue % 2 == 1);
    }
    private void setPalindromic() {
        // Variables
        boolean isPalindromic = false;
        String numberString = String.valueOf(numberValue);
        int index = 0;
        int numberLength = numberString.length();
        char firstChar;
        char lastChar;

        this.palindromic = false;
    }


    // Methods
    private static boolean endsByX(long userInput, int digit) {
        // This method returns true if userInput ends with digit X,
        // and returns false elsewhere;

        return (userInput % 10 == digit);
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
