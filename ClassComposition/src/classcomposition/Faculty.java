/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcomposition;

/**
 *
 * @author Predator
 */
public class Faculty {
    private String name;
    //course 0..3
    private Course[] courses = new Course[3];

    public Faculty() {
        for(int i=0;i<courses.length;i++){
            courses[i] = new Course();
        }
    }

    
}
