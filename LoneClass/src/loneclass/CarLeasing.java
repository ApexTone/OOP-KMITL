/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loneclass;

import java.util.Date;

/**
 *
 * @author Predator
 */
public class CarLeasing {
    private String model;
    private double downPayment;
    private double modelPrice;
    private int month;
    private double annualRate;
    private Date date;

    public CarLeasing() {
        date = new Date();
    }

    public CarLeasing(String model, double down, double modelPrice, int month, double annualRate) {
        date = new Date();
        this.model = model;
        this.downPayment = down;
        this.modelPrice = modelPrice;
        this.month = month;
        this.annualRate = annualRate;
    }
    
    public Date getDate(){
        return date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getModelPrice() {
        return modelPrice;
    }

    public void setModelPrice(double modelPrice) {
        this.modelPrice = modelPrice;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }
    
    public double getMonthlyPayment(){
        double unpaid = modelPrice-downPayment;
        //System.out.println(unpaid);
        
        //Calculate mounthly annualRate
        double monthlyRate = annualRate/12;
        
        return unpaid/month * monthlyRate/100;
    }
    public double getTotalPayment(){
        return getMonthlyPayment()*month;
    }
    
}
