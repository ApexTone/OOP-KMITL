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
public class Course {
    private String name;
    private String[] students = new String[100];
    private int numberOfStudents=0;

    public Course() {
    }
    public Course(String name) {
        this.name = name;
    }
    
    public void addStudent(String student){
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getName() {
        return name;
    }
    public void dropStudent(String student){//IMPLEMENT
        for(int i=0;i<numberOfStudents;i++){
            if(students[i].contentEquals(student)){
                students[i] = students[numberOfStudents-1];
                students[numberOfStudents-1]=null;
                numberOfStudents--;
                break;
            }
        }
    }
    
    public void clear(){
        for(int i=0;i<numberOfStudents;i++){
            students[i] = null;
        }
        numberOfStudents=0;
    }
    
    
}
