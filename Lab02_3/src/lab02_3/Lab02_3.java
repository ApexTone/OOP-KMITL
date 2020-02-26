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
public class Lab02_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        demo2();
    }

    public static void demo1() {
        Course oop = new Course("OOP With JAVA");
        oop.addStudent("Jake");
        oop.addStudent("Jack");
        oop.addStudent("Jim");
        for (int i = 0; i < oop.getNumberOfStudents(); i++) {
            System.out.println(oop.getStudents()[i]);
        }
        System.out.println("-----------------------------");
        oop.dropStudent("Jake");
        for (int i = 0; i < oop.getNumberOfStudents(); i++) {
            System.out.println(oop.getStudents()[i]);
        }

        oop.clear();
        for (int i = 0; i < oop.getNumberOfStudents(); i++) {
            System.out.println(oop.getStudents()[i]);
        }
    }

    public static void demo2() {
        CourseStudentOBJ oop = new CourseStudentOBJ("OOP with java");
        Student a = new Student("A");
        Student b = new Student("B");
        Student c = new Student("C");
        oop.addStudent(a);
        oop.addStudent(b);
        oop.addStudent(c);
        System.out.println(oop.getAllStudentsString());
        System.out.println("-----------------------------");
        oop.dropStudent(b);
        System.out.println(oop.getAllStudentsString());
        oop.clear();
        System.out.println(oop.getAllStudentsString());
    }

}
