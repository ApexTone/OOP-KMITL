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
public class Faculty extends Employee{

    public Faculty() {
        super();
        System.out.println("4.New Faculty");
    }
    
    public static void main(String[] args) {
        new Faculty();
    }
}

class Employee extends Person{
    public Employee(){
        this("2.New Employee");
        System.out.println("3.No args employee");
    }
    public Employee(String s){
        super();
        System.out.println(s);
    }
}
class Person{

    public Person() {
        System.out.println("1.New Person");
    }
}