/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11;

import java.util.Date;

/**
 *
 * @author Predator
 */
public class Geometric {
    private String color;
    private Boolean isFilled;
    private Date dateCreated;

    public Geometric(){
        dateCreated = new Date();
    }
    public Geometric(String color, Boolean isFilled, Date dateCreated) {
        this.color = color;
        this.isFilled = isFilled;
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Boolean getIsFilled() {
        return isFilled;
    }
    public void setIsFilled(Boolean isFilled) {
        this.isFilled = isFilled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", isFilled=" + isFilled + ", dateCreated=" + dateCreated + '}';
    }
 
    
    
}
