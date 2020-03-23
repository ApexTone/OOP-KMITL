/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author Predator
 */

//A class must implements all abstract method in an interface
public class Human implements Walkable{//Implementing interface. Note the 'implements' keyword
    
    
    @Override
    public void method1() {
        System.out.println("Something from interface m,x:  " + n + ", "+ x);
    }
    @Override
    public void howToWalk(){
        System.out.println("Altering 2 feet");
    }
    
 
    public static void main(String[] args) {
        Human t1 = new Human();
        t1.method1();
        t1.howToWalk();
    }
}
