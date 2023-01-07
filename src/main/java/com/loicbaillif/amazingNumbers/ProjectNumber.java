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
        System.out.println(isEven());
    }

    // Getters and Setters

    boolean isEven() {
        return even;
    }

    private void setEven() {
        this.even = (numberValue % 2 == 0);
    }
}
