/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcomposition;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Predator
 */
public class Student {
    private String name,id,faculty,major;
    private LocalDateTime dob;
    private int courseCount = 0;
    private Course[] courses = new Course[7];

    public Student() {
        for(int i = 0; i<courses.length;i++){
            courses[i] = new Course();
        }
    }

    public Student(String name, String id, String faculty, String major, LocalDateTime dob) {
        this.name = name;
        this.id = id;
        this.faculty = faculty;
        this.major = major;
        this.dob = dob;
        for(int i = 0; i<courses.length;i++){
            courses[i] = new Course();
        }
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    
    public void addCouse(Course newCourse){
        if(courseCount<=7){
            courses[courseCount++] = newCourse;
        }
        else{
            System.out.println("Maximum courses capacity reaches");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<courses.length;i++){
            sb.append(" " + courses[i]);
        }
        return "Student{" + "name=" + name + ", id=" + id + ", faculty=" + faculty + ", major=" + major + ", dob=" + dob + 
                ", courses=" + sb.toString() +'}';
    }
    
    
}
