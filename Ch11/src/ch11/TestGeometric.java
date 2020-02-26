/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11;

/**
 *
 * @author Predator
 */
public class TestGeometric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(12);
        Rectangle r1 = new Rectangle(6, 5);
        System.out.println(c1.getData());
        System.out.println(c1);
        System.out.println(r1.getData());
        System.out.println(r1);
    }
    
}
