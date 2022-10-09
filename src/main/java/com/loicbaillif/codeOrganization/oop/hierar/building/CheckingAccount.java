package com.loicbaillif.codeOrganization.oop.hierar.building;

public class CheckingAccount extends BankAccount {
    // Fields
    private double fee;

    // Constructor
    public CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}
