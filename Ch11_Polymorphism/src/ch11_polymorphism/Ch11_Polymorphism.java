/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_polymorphism;

import java.util.*;

/**
 *
 * @author Predator
 */
public class Ch11_Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Geometric c1 = new Circle(12.5);//Polymorphism
        Geometric r1 = new Rectangle(10,5);
        if(c1 instanceof Circle){//Count as instance of Circle+Geometric [Checking instance]
            System.out.println(c1);
            System.out.println(c1.getArea());
            System.out.println(((Circle)c1).getArea());//Object casting
        }
        if(r1 instanceof Geometric){//Count as instance of Rectangle+Geometric
            System.out.println(r1);
            System.out.println(r1.getArea());
            System.out.println(((Rectangle)r1).getArea());//Object casting
        }
        
        ArrayList<Geometric> list = new ArrayList<>();//Using polymorphism advantage
        list.add(new Geometric("Red", new Date()));//Geometric class
        list.add(r1);//Rectangle class
        list.add(c1);//Circle class
        for(Geometric g : list){
            if(g instanceof Circle){
                System.out.println(((Circle) g).getRadius());
            }
            else if(g instanceof Rectangle){
                System.out.println(((Rectangle) g).getWidth()+" "+((Rectangle) g).getWidth());
            }
            else{
                System.out.println(g.getColor()+" "+g.getDateCreated());
            }
        }
    }

}
