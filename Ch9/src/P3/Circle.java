/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;

/**
 *
 * @author Predator
 */
public class Circle {

    private double radius;
    private String color;
    private static int numberOfObj;
    private static double totalArea;
    
    public static int getNumberOfObj() {
        return numberOfObj;
    }

    public static void setNumberOfObj(int aNumberOfObj) {
        numberOfObj = aNumberOfObj;
    }

    public Circle() {
        this(1, "Black");
    }

    public Circle(double radius) {
        this(radius,"Black");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        totalArea+=getArea();
        numberOfObj++;
    }

    public final double getArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public static double getTotalArea(){
        return totalArea;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }    
}
