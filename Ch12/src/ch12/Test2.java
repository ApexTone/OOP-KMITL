/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12;

/**
 *
 * @author Predator
 */
public class Test2 {
    public static void main(String[] args){
        int a=5,b=3;
        
        //Multiple exception catching will be select automaticly from top-most to lower-most exception
        try {
            int result = a/b;
            System.out.println(result);
            
            Circle c1 = null;
            System.out.println(c1.radius);
            
            int[] n = new int[3];
            n[3]=99;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch(NullPointerException e){
            System.out.println(e);
        } catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        
        //When found exception in try block, the block will be skipped
        System.out.println("Ending");
    }
}

class Circle{
    double radius = 5;
}