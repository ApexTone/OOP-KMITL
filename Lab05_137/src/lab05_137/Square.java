/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05_137;

/**
 *
 * @author Predator
 */
public class Square extends GeometricObject implements Colorable{
    private double length;
    public Square(){
    }
    public Square(double length) {
        this.length = length;
    }
    public Square(double length, String color) {
        super(color);
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    
    
    
    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all 4 sides");
    }
    
}
