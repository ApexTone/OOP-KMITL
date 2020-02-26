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
public class CheckingAccount extends Account{

    public CheckingAccount() {
        setAnnualInterestRate(0);
    }

    public CheckingAccount(String name, int id, double balance) {
        super(name, id, balance);
        setAnnualInterestRate(0);
    }
    
    @Override
    public double withdraw(double money){
        if(money>=0  && balance-money>=20){
            balance-=(money+20);
            transactions.add(new Transaction('W', money, balance, name));
            transactions.add(new Transaction('F', 20, balance, name));
            return balance;
        }
        else{
            System.out.println("Not enough balance/Negative input");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +super.toString() +'}';
    }
    
    
}
