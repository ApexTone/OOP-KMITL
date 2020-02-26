/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;

import java.util.Random;

/**
 *
 * @author Predator
 */
public class ClassArray {
    public static String randomColor(){
        Random r = new Random();
        String a;
        switch (r.nextInt()%4) {
            case 0:
                a = "Red";
                break;
            case 1:
                 a = "Yellow";
                 break;
            case 2:
                a = "Green";
                break;
            case 3:
                a = "Black";
                break;
            default:
                a = "White";
        }
        return a;
    }
    public static double getTotalArea(Circle[] circles){
        double totalArea=0;
        for (Circle circle : circles) {
            totalArea += circle.getArea();
        }
        return totalArea;
    }
    
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];//Create new array (no pointing yet)

        double totalArea = 0;
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(Math.random()*10,randomColor());
            
            System.out.print(circles[i].toString()+"  ");
            System.out.println(circles[i].getArea());
            totalArea+=circles[i].getArea();
        }
        System.out.println(getTotalArea(circles));
        System.out.println(totalArea);
        System.out.println(Circle.getTotalArea());
        System.out.println(Circle.getNumberOfObj());
    }
    
    
    
}
