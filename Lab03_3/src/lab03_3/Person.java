/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_3;

/**
 *
 * @author Predator
 */
public class Person {
    protected String name,address,phoneNumber,email;
    
    public Person(){
    }
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    protected void foo(){
        System.out.println("foo");
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }
}
