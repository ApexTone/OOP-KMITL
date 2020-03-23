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
public class Foo {
    private int a;//data field
    
    public Foo(){//constructor
    }
    public Foo(int a){//constructor
        this.a=a;
    }

    public void setA(int a) {//setter
        this.a = a;
    }
    public int getA() {//getter
        return a;
    }
    
    public int doubleTheA(){//method
        return a*2;
    }
    
    public static void main(String[] args) {
        Fa f = new Fa();
        if(f instanceof Fa){
            System.out.println("1");
        }
        if(f instanceof Na){
            System.out.println("2");
        }
        if(f instanceof Bar){
            System.out.println("3");
        }
        if(f instanceof Object){
            System.out.println("4");
        }
    }
}

class Bar{
    int x=99;
    public Bar() {
        System.out.println("Bar");
    }
    
}
class Na extends Bar{
    public Na(){
        System.out.println("Na");
    }
}
class Fa extends Na{

    public Fa() {
        System.out.println("Fa");
        System.out.println(this.x);
    }
    
}