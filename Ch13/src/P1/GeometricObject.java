package P1;

import java.util.*;

//Use abstract class to show strong-relation (is-a)
//Abstract class can't be instantiated and may contain abstract method.
public abstract class GeometricObject {//Declaring abstract class: Note the 'abstract' keyword
    //Data fields

    private String color;
    private Date dateCreated;

    //constructor: Provided for constructor chaining, not normal usage
    protected GeometricObject() {//Note the 'protected' access modifier
        dateCreated = new Date();
    }

    protected GeometricObject(String color) {
        this.color = color;
        dateCreated = new Date();
    }

    //getters/setters
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

    //Only an abstract class can have abstract methods.
    public abstract double getArea(); //Declaring abstract method: No body (implementation)

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", dateCreated=" + dateCreated + '}';
    }
}

//Subclass must override ALL superclass abstract method or it will still be an abstract class
class Circle extends GeometricObject {//Extending abstract class
    //Data field

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Overriding abstract methods. Note that there're no 'abstract' keyword here
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Circle{" + "radius=" + radius + '}';
    }

}

class Rectangle extends GeometricObject {

    private double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
}
