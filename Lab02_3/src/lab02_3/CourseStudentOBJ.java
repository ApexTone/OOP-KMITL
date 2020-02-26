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
public class CourseStudentOBJ {
    private String name;
    private Student[] students = new Student[100];
    private int numberOfStudents=0;

    //Constructor
    public CourseStudentOBJ() {
    }
    public CourseStudentOBJ(String name) {
        this.name = name;
    }

    //getters/setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    
    //Method
    public void addStudent(Student newStudent){
        students[numberOfStudents++] = newStudent;
    }
    public void dropStudent(Student dropStudent){
        for(int i=0;i<numberOfStudents;i++){
            if(students[i] == dropStudent){
                students[i] = students[--numberOfStudents];
                students[numberOfStudents] = null;
                break;
            }
            else if(i == numberOfStudents-1 && students[i]!=dropStudent){
                System.out.println("Can't find that student");
            }
        }
    }
    public void clear(){
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }
    
    public String getAllStudentsString(){
        String s="";
        for(int i=0;i<numberOfStudents;i++){
            s+=" " + students[i].getName();
        }
        
        return s;
    }

    @Override
    public String toString() {
        return "CourseStudentOBJ{" + "name=" + name + ", students=" + students + ", numberOfStudents=" + numberOfStudents + '}';
    }
    
    
}
