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
public class Rectangle extends Geometric{
    private double width,height;
    
    public Rectangle(){
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, Boolean isFilled, Date dateCreated) {
        super(color, isFilled, dateCreated);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    public String getData(){
        return "Rectangle{" + "width=" + width + ", height=" + height + ", "+ super.toString() +'}';
    }
    public double getArea(){
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
}
