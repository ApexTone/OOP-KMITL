/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author Predator
 */
public class Circle {
    //Note the private modifier here
    private double radius;
    private String color;
    private Boolean isFilled;
    private static int numberOfObject = 0;
    
    public Circle() {
        numberOfObject++;
    }

    public Circle(double radius, String color, Boolean isFilled) {
        this.radius = radius;
        this.color = color;
        this.isFilled = isFilled;
        numberOfObject++;
    }

 /*
    setter = mutator
    getter = accessor
 */
    
    
    public void setIsFilled(Boolean isFilled) {
        this.isFilled = isFilled;
    }

    public Boolean getIsFilled() {
        return isFilled;
    }    

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
}
