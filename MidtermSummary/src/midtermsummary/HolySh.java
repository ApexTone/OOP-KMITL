/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermsummary;

/**
 *
 * @author Predator
 */
public class HolySh {
    public static void main(String[] args) {
        Foo a = new Foo();
        Foo b = new Foo();
        a.a=9;
        swap1(a, b);
        System.out.println(a.a+" "+b.a);
        swap2(a, b);
        System.out.println(a.a+" "+b.a);
        
    }
   public static void swap1(Foo a, Foo b){
       Foo temp = a;
       a=b;
       b=temp;
       System.out.println(a.a+" "+b.a);
   }
   public static void swap2(Foo a,Foo b){
       int temp=a.a;
       a.a=b.a;
       b.a=temp;
        System.out.println(a.a+" "+b.a);
   }
}

class Foo{
    int a=2;
    
}
