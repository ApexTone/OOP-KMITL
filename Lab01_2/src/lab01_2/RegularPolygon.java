/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_2;

/**
 *
 * @author Predator
 */
public class RegularPolygon {
    private double sideLength;
    private int side;
    private double x,y;

    //Constructor 
    public RegularPolygon() {
    }
    public RegularPolygon(int side) {
        this.side = side;
    }
    public RegularPolygon(int side,double sideLength) {
        this.sideLength = sideLength;
        this.side = side;
    }
    public RegularPolygon(int side,double sideLength, double x, double y) {
        this.sideLength = sideLength;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    

    //Setter
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    public void setSide(int side) {
        this.side = side;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    
    //Getter
    public double getSideLength() {
        return sideLength;
    }
    public int getSide() {
        return side;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
    
    //Method
    public double getPerimeter(){
        return side*sideLength;
    }
    public double getArea(){
        double temp1 = side*sideLength*sideLength;
        double temp2 = 4*Math.tan(Math.PI/side);
        return temp1/temp2;
    }
    
    

}
