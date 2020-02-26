/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04_1;

import java.util.ArrayList;

/**
 *
 * @author Predator
 */
public class AssignmentList {
    private ArrayList<Assignment> itemList;

    public AssignmentList() {
        itemList = new ArrayList<Assignment>();
    }
    public void addItem(Assignment assignment){
        itemList.add(assignment);
    }
    public double computeCourseGrade(){
        double totalScore=0,totalWeight=0;
        for(Assignment assignment: itemList){
            totalScore+=(assignment.getTotalWeight()*assignment.getScore()/assignment.getTotalPoints());
            totalWeight+=assignment.getTotalWeight();
        }
        return totalScore/totalWeight;
    }

    @Override
    public String toString() {
        String s="";
        for(Assignment assignment: itemList){
            s+=assignment.toString()+"\n";
        }
        return s;
    }
    
    
    
}
