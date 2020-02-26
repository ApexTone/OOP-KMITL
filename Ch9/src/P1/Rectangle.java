/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

/**
 *
 * @author Predator
 */
public class Rectangle {

    private double width, length;
    private String color;
    private Boolean isFilled;

    public Rectangle() {
    }

    public Rectangle(double width, double length, String color, Boolean isFilled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.isFilled = isFilled;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
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

    public double getArea() {
        return width * length;
    }
}
