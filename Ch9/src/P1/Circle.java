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
public class Circle {

    double radius;//Default: null
    String color;//Default: ""
    boolean isFilled;//Default: false

    static int numberOfObject = 0;//Static variable shares value across all obj

    public Circle() {
        numberOfObject++;
    }

    public Circle(double radius, String color, boolean isFilled) {
        this.radius = radius;
        this.color = color;
        this.isFilled = isFilled;
        numberOfObject++;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}

class TestCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.radius);
        System.out.println(c1.color);
        System.out.println(c1.isFilled);
        System.out.println(c1.getClass().getName() + " area is: " + c1.getArea());
        
        System.out.println(Circle.numberOfObject);//Accessing static variable: Can be called by class name

        Circle c2 = new Circle(2.5, "Green", true);
        System.out.println(c2.radius);
        System.out.println(c2.color);
        System.out.println(c2.isFilled);
        System.out.println(c2.getClass().getName() + " area is: " + c2.getArea());

        System.out.println(Circle.numberOfObject);//Accessing static variable: Can be called by class name
    }
}
