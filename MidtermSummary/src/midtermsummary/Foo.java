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
    
}
