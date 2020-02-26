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
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5.2);
        System.out.println(c1.getRadius());//Can't access radius field normally
    }
}
