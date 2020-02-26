/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_1;

import java.util.Date;

/**
 *
 * @author Predator
 */
public class Transaction {
    private Date dateMade;
    private char type;
    
    private double amount,balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        dateMade = new Date();
    }

    @Override
    public String toString() {
        return "Transaction{" + "dateMade=" + dateMade + ", type=" + type + ", amount=" + amount + ", balance=" + balance + ", description=" + description + '}';
    }
    
    
}
