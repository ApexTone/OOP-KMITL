/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_3;

/**
 *
 * @author Predator
 */
public class Faculty {
    private Course[] courses = new Course[3];
    private int numberOfCourse = 0;
    
    public Faculty() {
        for(int i=0;i<3;i++){
            courses[i] = new Course();
        }
    }
    
    public void addCourse(Course newCourse){
        if(numberOfCourse<3)
            courses[numberOfCourse++] = newCourse;
        else
            System.out.println("Can't add more courses");
    }
    
    
}
