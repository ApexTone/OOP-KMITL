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
public class Course {
    private String name,id,description;
    private int credit;

    public Course() {
    }

     public Course(String name, String id) {
        this.name = name;
        this.id = id;
        this.description = "";
        this.credit = 0;
    }
    
    public Course(String name, String id, String description, int credit) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.credit = credit;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", id=" + id + ", description=" + description + ", credit=" + credit + '}';
    }

    
}
