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
public class Rethrowing {
    public static void main(String[] args) {
        try{
            m1();
        }
        catch(Exception e){
            System.out.println("in main, from m1: "+e);
        }
    }
   
    public static void m1() throws Exception{ 
        try{
            m2();
        }
        catch(Exception e){
            System.out.println("In m1, from m2: "+e);
            throw e;//still wanna throw the exception anyway
        }
    }
    public static void m2() throws Exception{//you can the exception so you don't need to "throws" it again
        try{
            m3();
        }
        catch(Exception e){
            System.out.println("In m2, from m3: "+e);
            throw e;//this line will throws the exception although it has been catched in this block
        }
        finally{//will be done even after try or catch
            System.out.println("This will be done before exception throwing");
        }
    }
    public static void m3() throws Exception{//if you don't fix the exception, you always need to "throws" it
        throw new Exception("m3 exception");
    }
}
