/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12;

/**
 *
 * @author Predator
 */
public class InvalidRadiusException extends Exception {//must extends Exception

    private double radius;

    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Circle {

    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius) throws InvalidRadiusException{
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException {//Throwing custom exception
        if (newRadius > 0) {
            radius = newRadius;
        } else {
            throw new InvalidRadiusException(newRadius);
        }
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
}

class TestCircle{
    public static void main(String[] args) {
       Circle c1=null,c2=null;
        try{
           c1 = new Circle(99);
           c2 = new Circle(-1);
       }
       catch(InvalidRadiusException exception){
           System.out.println(exception);
       }
       
        System.out.println(c1);
        System.out.println(c2);
    }
}