/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_3;

import java.util.Scanner;

/**
 *
 * @author Predator
 */
public class Lab01_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ax+by=e");
        System.out.println("cx+dy=f");
        LinearEquation eq1 = new LinearEquation();
        Scanner input = new Scanner(System.in);
        System.out.println("Input the equation in this order, a,b,e,c,d,f: ");
        eq1.setA(input.nextDouble());
        eq1.setB(input.nextDouble());
        eq1.setE(input.nextDouble());
        eq1.setC(input.nextDouble());
        eq1.setD(input.nextDouble());
        eq1.setF(input.nextDouble());
        
        System.out.println(eq1.getX());
        System.out.println(eq1.getY());
    }
    
}
