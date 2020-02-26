/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Predator
 */
public class Account_Simplify {
       private String id;
       private double balance;
       private Date dateCreated;

    //Constructor
    public Account_Simplify() {
    }
    public Account_Simplify(String id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = Calendar.getInstance().getTime();  // Same with dateCreated = new Date();
    }

    //Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setId(String id) {
        this.id = id;
    }

    //Getter
    public double getBalance() {
        return balance;
    }
    public String getId() {
        return id;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    
    //Method
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
