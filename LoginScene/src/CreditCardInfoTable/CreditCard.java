/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardInfoTable;

/**
 *
 * @author Predator
 */
public class CreditCard {
    public static final String GOLD="gold",SILVER="silver",BRONZE="bronze";
    public static final String AEON="aeon",MASTERCARD="mastercard";
    
    private String serial, CCV, name, expDate, company, type, level, money, state, startDate;
    
    public CreditCard() {
    }

    public CreditCard(String serial, String CCV, String name, String expDate, String company, String type, String level, String money, String state, String startDate) {
        this.serial = serial;
        this.CCV = CCV;
        this.name = name;
        this.expDate = expDate;
        this.company = company;
        this.type = type;
        this.level = level;
        this.money = money;
        this.state = state;
        this.startDate = startDate;
    }

    public String getCCV() {
        return CCV;
    }

    public String getCompany() {
        return company;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getLevel() {
        return level;
    }

    public String getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getSerial() {
        return serial;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getState() {
        return state;
    }

    public String getType() {
        return type;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setCCV(String CCV) {
        this.CCV = CCV;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

}
