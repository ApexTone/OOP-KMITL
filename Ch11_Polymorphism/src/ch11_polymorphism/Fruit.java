/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_polymorphism;

/**
 *
 * @author Predator
 */
public class Fruit {
    int fProp;
    public static void main(String[] args) {
        Object f = new Fruit();
        Apple a = new Apple();
        Orange o = new Orange();
        //Apple a2 = (Apple)f;//Compile w/o error but create run time error (superclass cast to subclass)
        
        Object f2 = new Apple();
        Apple a3 = (Apple)f2;//same class casting is OK
    }
    
}
class Apple extends Fruit{
    int aProp;
}
class Orange extends Fruit{
    int oProp;
 }
