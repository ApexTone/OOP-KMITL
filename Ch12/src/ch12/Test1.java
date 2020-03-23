/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12;

import java.util.Scanner;

/**
 *
 * @author Predator
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        
        if(n2!=0){//Prevent crashing with if...else
            System.out.println(n1 / n2);
        }
        else{   
            System.out.println("Divisor can't be zero!");
        }
        
        try {//Use try-catch block to deal with Exception
            int result = division2(n1, n2);//this method may "throws" ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {//Handling the exception. Won't terminate the program
            System.out.println("Handle the exception pls: "+e);
        }
        
        int result = division1(n1, n2);
        System.out.println(result);
    }
    
    public static int division1(int a, int b){
        if(b==0){//Prevent crashing with method
            System.out.println("Divisor can't be zero!");
            System.exit(1);//Terminate the program and return exit code
        }
        return a/b;
    }
    
    public static int division2(int a,int b) throws ArithmeticException{//prevent crashing with Exception
        if(b==0){
            throw new ArithmeticException("Divisor can't be zero!");//"throwing" Exception
        }
        return a/b;
    }
}
