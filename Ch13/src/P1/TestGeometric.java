/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import java.util.*;

/**
 *
 * @author Predator
 */
public class TestGeometric {
    public static void main(String[] args) throws CloneNotSupportedException{ 
        ArrayList<GeometricObject> list = new ArrayList<>();
        list.add(new Circle(5));
        list.add(new Rectangle(99, 2));
        for(GeometricObject i : list){
            System.out.println(i);
        }
        
        ComparableRectangle r1 = new ComparableRectangle(5, 2);
        ComparableRectangle r2 = new ComparableRectangle(5, 3);
        System.out.println(r1.compareTo(r2));
        
        ComparableRectangle r3 = (ComparableRectangle)r1.clone();
        System.out.println(r3.compareTo(r1));
        System.out.println(r3 == r1);
    }
}
