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
public class CircleWithException {
    private double radius=1;

    public CircleWithException() {
    }

    public CircleWithException(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) throws IllegalArgumentException{
        if(radius>0) this.radius = radius;
        else throw new IllegalArgumentException();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "CircleWithException{" + "radius=" + radius + '}';
    }
    
    
}

class TestCircle{
    public static void main(String[] args) {
        CircleWithException c1 = new CircleWithException();
        CircleWithException c2 = new CircleWithException();
        try {
            c1.setRadius(5);
            c2.setRadius(-5);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException);
        }
        
        System.out.println(c1);
        System.out.println(c2);
    }
}
