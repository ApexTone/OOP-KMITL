/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s62010356;

/**
 *
 * @author Predator
 */
public class Hotel {
    public static final int fiveStar=5,fourStar=4,triStar=3;
    private String name;
    private String location;
    private int numberOfRoom;
    private int stars;

    //Constructor
    public Hotel(){
    }
    public Hotel(String name, String location, int numberOfRoom, int stars) {
        this.name = name;
        this.location = location;
        this.numberOfRoom = numberOfRoom;
        setStars(stars);
    }

    //Getters/setters: All data field
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getNumberOfRoom() {
        return numberOfRoom;
    }
    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }
    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        if(stars==fiveStar || stars==fourStar || stars==triStar){
            this.stars=stars;
        }
        else {
            System.out.println("Invalid stars rating (3-5)");
        }
    }


    //method
    public int getPricePerDay(){
        if(stars==fiveStar) {
            return 9000;
        }
        else if(stars==fourStar){
            return 5000;
        }
        else if(stars==triStar){
            return 3500;
        }
        else{
            System.out.println("Invalid stars rating (3-5)");
            return -1;
        }
    }

    //toString
    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", numberOfRoom='" + numberOfRoom + '\'' +
                ", stars=" + stars +
                '}';
    }
}

