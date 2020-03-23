/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05_135;

/**
 *
 * @author Predator
 */
public class Lab05_135 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometricObject r1 = new Rectangle(5, 6);
        GeometricObject r2 = new Rectangle(5, 5);
        System.out.println(GeometricObject.max(r1, r2));
        
        GeometricObject c1 = new Circle(5);
        GeometricObject c2 = new Circle(6);
        System.out.println(GeometricObject.max(c1, c2));
    }
    
}
