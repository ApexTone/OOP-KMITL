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
public class Student extends Person{
    public final static int freshman=1,sophomore=2,junior=3,senior=4;
    private int status;

    public Student(int status) {
        this.status = status;
    }

    public Student(int status, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public int getStatus() {
        foo();
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "status=" + status + ", "+super.toString()+'}';
    }
    
    
    
}
