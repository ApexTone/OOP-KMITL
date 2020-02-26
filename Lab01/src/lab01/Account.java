/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Predator
 */
public class Account {
       private int id;
       private double balance;
       private double annualInterestRate=0;
       private Date dateCreated;

    //Constructor
    public Account() {
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = Calendar.getInstance().getTime();  // Same with dateCreated = new Date();
    }

    //Setter
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate/100;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Getter
    public double getAnnualInterestRate() {
        return annualInterestRate*100;
    }
    public double getBalance() {
        return balance;
    }
    public int getId() {
        return id;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    
    //Method
    public double getMonthlyInterest(){
        return balance*getMonthlyInterest();
    }
    public double withdraw(double money){
        if(money>=0  && balance-money>=0){
            balance-=money;
            return balance;
        }
        else{
            System.out.println("Not enough balance/Negative input");
            return 0;
        }
    }
    public void deposit(double money){
        if(money>=0){
            balance+=money;
        }
        else{
            System.out.println("You sneaky aren't ya");
        }
    }
}
