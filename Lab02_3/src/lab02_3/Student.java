/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_3;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Predator
 */
public class Student {
    private String name;
    private Course[] courses = new Course[7];
    private int numberOfCourse = 0;

    public Student() {
        for(int i=0;i<7;i++){
            courses[i] = new Course();
        }
    }
    public Student(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addCourse(Course newCourse){
        if(numberOfCourse<7)
            courses[numberOfCourse++] = newCourse;
        else
            System.out.println("Can't add more courses");
    }
   

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", courses=" + courses + ", numberOfCourse=" + numberOfCourse + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Arrays.deepHashCode(this.courses);
        hash = 43 * hash + this.numberOfCourse;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.numberOfCourse != other.numberOfCourse) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
