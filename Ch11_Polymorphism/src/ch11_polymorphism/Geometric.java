/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_polymorphism;

import java.util.Date;

/**
 *
 * @author Predator
 */
public class Geometric {
    private String color;
    private Date dateCreated;

    public Geometric() {
        dateCreated = new Date();
    }
    public Geometric(String color, Date dateCreated) {
        this.color = color;
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", dateCreated=" + dateCreated + '}';
    }
    

    public double getArea() {//Declare for subclass supporting: Method matching at compile time
        return 0.0;
    }
    
    
}
