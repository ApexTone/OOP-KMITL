/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;


/**
 *
 * @author Predator
 */
public class Test {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Chicken c = new Chicken();
        Orange o = new Orange();
        Apple a = new Apple();
        
        System.out.println(t.sound());
        System.out.println(c.sound());
        System.out.println(c.howToEat());
        System.out.println(o.howToEat());
        System.out.println(a.howToEat());
    }
}
