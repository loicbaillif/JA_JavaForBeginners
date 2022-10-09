package com.loicbaillif.codeOrganization.oop.hierar.building;

import com.loicbaillif.tools.Print;

public class Ex1 {
    /* https://hyperskill.org/learn/step/3042
     * You are given a class named BankAccount. The class has two fields:
     * number and balance.
     *
     * Define two classes which inherit from the BankAccount:
     *      . CheckingAccount containing the double field fee.
     *      . SavingsAccount containing the double field interestRate.
     *
     * Each new class should have a constructor with three parameters to
     * initialize all fields:
     *      . CheckingAccount(String number, Long balance, double fee)
     *      . SavingsAccount(String number, Long balance, double interestRate)
     *
     * Do not forget to invoke the superclass constructor when creating objects.
     */

    public static void main() {
        Print.title("The keyword super - Exercise: Bank Account");
    }
}
