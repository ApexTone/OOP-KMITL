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
public class Lab01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon();
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
        
        RegularPolygon r2 = new RegularPolygon(6,4);
        System.out.println(r2.getPerimeter());
        System.out.println(r2.getArea());
        
        RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println(r3.getPerimeter());
        System.out.println(r3.getArea());
    }
    
}
