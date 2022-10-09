package com.loicbaillif.codeOrganization.oop.hierar.building;

public class CheckingAccount extends BankAccount {
    // Fields
    double fee;

    // Constructor
    public CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}
