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
public class PriviledgedAccount extends Account{
    private int overdrawn;

    public PriviledgedAccount(){
        setAnnualInterestRate(2.5);
    }
    public PriviledgedAccount(int overdrawn) {
        this.overdrawn = overdrawn;
        setAnnualInterestRate(2.5);
    }
    public PriviledgedAccount(int overdrawn, String name, int id, double balance) {
        super(name, id, balance);
        this.overdrawn = overdrawn;
        setAnnualInterestRate(2.5);
    }
    
    
    
    @Override
    public double withdraw(double money){
        if(money>=0  && balance-money>=0){
            balance-=money;
            transactions.add(new Transaction('W', money, balance, name));
            return balance;
        }
        else if(balance-money>=-overdrawn){
            balance-=money;
            transactions.add(new Transaction('O', money, balance, name));
            return balance;
        }
        else{
            System.out.println("Overdrawn!");
            return 0;
        }
    }
    @Override
    public double getMonthlyInterest(){
        if(balance>=0){
            return balance*getMonthlyInterestRate()/100;
        }
        else{
            System.out.println("You're still in debt!");
            return -1;
        }
    }

    public int getOverdrawn() {
        return overdrawn;
    }

    public void setOverdrawn(int overdrawn) {
        this.overdrawn = overdrawn;
    }

    @Override
    public String toString() {
        return "PriviledgedAccount{" + "overdrawn=" + overdrawn +", "+super.toString() +'}';
    }
    
    
}
