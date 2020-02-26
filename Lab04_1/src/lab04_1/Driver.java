/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04_1;

/**
 *
 * @author Predator
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AssignmentList list = new AssignmentList();
        
        Project p1 = new Project("Unit testing", 12, 1, 23, 0, "Unit testing.pdf", "Snacks.csv");
        p1.setScore(0.78);
        p1.setTotalPoints(0.99);
        p1.setTotalWeight(0.30);
        list.addItem(p1);
        Assignment a = new Assignment("Unit testing", 12, 1, 5, 50);
        a.setScore(0.78);
        a.setTotalPoints(0.99);
        a.setTotalWeight(0.30);
        list.addItem(a);
        Lab l = new Lab("Unit testing", 12, 1, 23, 0, "Unit testing.pdf");
        l.setScore(0.78);
        l.setTotalPoints(0.99);
        l.setTotalWeight(0.30);
        list.addItem(l);
        
        System.out.print(list); 
        System.out.println(list.computeCourseGrade());
    }
    
}
