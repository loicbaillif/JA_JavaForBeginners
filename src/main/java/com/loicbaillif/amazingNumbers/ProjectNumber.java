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
    int numberValue;

    public ProjectNumber(int numberValue) {
        this.numberValue = numberValue;
    }

    // Getters and Setters

    boolean isEven() {
        return even;
    }

    private void setEven() {
        this.even = (numberValue % 2 == 0);
    }
}
