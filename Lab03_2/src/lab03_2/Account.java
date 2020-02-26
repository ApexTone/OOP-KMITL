/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Predator
 */
public class Account {
       protected int id;
       protected double balance;
       protected double annualInterestRate=2.5;
       protected Date dateCreated;
       
       protected String name;
       protected ArrayList<Transaction> transactions = new ArrayList<>();
       

    //Constructor
    public Account() {
    }
    public Account(String name,int id, double balance) {
        this.name=name;
        this.id = id;
        this.balance = balance;
        dateCreated = Calendar.getInstance().getTime();  // Same with dateCreated = new Date();
    }

    //Setter
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Getter
    public double getAnnualInterestRate() {
        return annualInterestRate;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    
    public String getTransactionData(){
        String s="";
        for(int i=0;i<transactions.size();i++){
            s+=transactions.get(i)+"\n";
        }
        return s;
    }
    
    
    //Method
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate()/100;
    }
    public double withdraw(double money){
        if(money>=0  && balance-money>=0){
            balance-=money;
            transactions.add(new Transaction('W', money, balance, name));
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
            transactions.add(new Transaction('D', money, balance, name)); 
        }
        else{
            System.out.println("You sneaky aren't ya");
        }
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate + ", dateCreated=" + dateCreated + ", name=" + name + ", transactions=" + transactions + '}';
    }
    
    
}
