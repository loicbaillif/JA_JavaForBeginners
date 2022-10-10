package com.loicbaillif.codeOrganization.oop.hierar.building;

public class BankAccount {
    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
