/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author Predator
 */
public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account(1122,20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(900000);
        System.out.println(acc.getBalance());
        acc.deposit(3000);
        System.out.println(acc.getBalance());
        System.out.println(acc.getDateCreated());
        //System.out.println(acc.getMonthlyInterest());
    }
}
