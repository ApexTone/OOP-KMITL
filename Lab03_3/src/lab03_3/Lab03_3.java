/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_3;

import java.util.Date;

/**
 *
 * @author Predator
 */
public class Lab03_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("TK", "KMITL", "0885290888", "korn_tanapol@outlook.co.th");
        Student s = new Student(Student.freshman, "TK", "KMITL", "0885290888", "korn_tanapol@outlook.co.th");
        Employee e = new Employee("Engineering", 5555, new Date(), "TK", "KMITL", "0885290888", "korn_tanapol@outlook.co.th");
        Faculty f = new Faculty("8.00-15.00", "Teacher", "Engineering", 5555, new Date(), "TK", "KMITL", "0885290888", "korn_tanapol@outlook.co.th");
        Staff st = new Staff("Cleaning", "Engineering", 5555, new Date(), "TK", "KMITL", "0885290888", "korn_tanapol@outlook.co.th");
        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
    
}
