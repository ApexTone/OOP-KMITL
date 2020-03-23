/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

//Use interface to show weak-relation (is-kind-of)

/**
 *
 * @author Predator
 */
public interface Walkable {//Declaring Interface. Note the 'interface' keyword
    //All data fields are 'public static final' which can be omitted
    int n = 5;
    char x = 'X';
    
    //All methods are 'public abstract' which can also be omitted
    void method1();
    void howToWalk();
}
