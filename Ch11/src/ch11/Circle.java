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
public class Circle extends Geometric{
    private double radius;

    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, Boolean isFilled, Date dateCreated) {
        super(color, isFilled, dateCreated);
        this.radius = radius;
    }

    
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }   
    
    public String getData(){
        return "Circle{" + "radius=" + radius + ", " + super.toString() + '}';
    }
    
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
   
}
