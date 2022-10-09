package com.loicbaillif.codeOrganization.oop.hierar.building;

public class SavingsAccount extends BankAccount {
    // Fields
    private double interestRate;

    // Constructors
    public SavingsAccount(String number, Long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }
}
