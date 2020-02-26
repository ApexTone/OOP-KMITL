/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_2;

/**
 *
 * @author Predator
 */
public class SavingsAccount extends Account{

    public SavingsAccount() {
        setAnnualInterestRate(1.25);
    }

    public SavingsAccount(String name, int id, double balance) {
        super(name, id, balance);
        setAnnualInterestRate(1.25);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + super.toString() +'}';
    }
    
    
    
    
}
