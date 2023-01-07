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
    }

    // Getters and Setters

    boolean isEven() {
        return even;
    }
    boolean isOdd() {
        return odd;
    }

    private void setEven() {
        this.even = (numberValue % 2 == 0);
    }
    private void setOdd() {
        this.odd = (numberValue % 2 == 1);
    }
}
