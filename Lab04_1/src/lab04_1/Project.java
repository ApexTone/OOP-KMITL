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
public class Project extends Assignment{
    private String specification;
    private String dataFile;

    public Project(String name, int month, int day, int hour, int minute,String specification, String dataFile) {
        super(name, month, day, hour, minute);
        this.specification = specification;
        this.dataFile = dataFile;
    }

    @Override
    public String toString() {
        return super.toString()+" "+String.format("Specification: %s; data file = %s", specification,dataFile);
    }
    
    
}
