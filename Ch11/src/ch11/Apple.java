/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11;

/**
 *
 * @author Predator
 */
public class Apple extends Fruit{
    public Apple(){
        super("New Apple");
    }
    public static void foo(){//static can't use @Override
        System.out.println("bar");
    }
    public static void main(String[] args) {
        new Apple();
        Apple.foo();
        Fruit.foo();
        Lemon.foo();
        Fruit[] fruits = {new Fruit("asdf"),new Apple(), new Lemon()};
        for(int i=0;i<fruits.length;i++){
            fruits[i].foo();
        }
    }
}
class Fruit{
    public Fruit(){
    }
    public Fruit(String s){ 
        System.out.println(s);
    }
    
    public static void foo(){
        System.out.println("foo");
    }
}
class Lemon extends Fruit{

    public Lemon() {
        super("new Lemon");
    }
    
    public static void foo(){
        System.out.println("nan");
    }
}
