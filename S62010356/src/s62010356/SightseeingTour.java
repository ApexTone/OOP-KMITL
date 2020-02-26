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
import java.util.Arrays;

public class SightseeingTour {
    private String[] attractions;
    private String city;

    //constructor
    public SightseeingTour(){
    }
    public SightseeingTour(String[] attractions, String city) {
        this.attractions = attractions;
        this.city = city;
    }

    //getters/setters
    public String[] getAttractions() {
        return attractions;
    }
    public void setAttractions(String[] attractions) {
        this.attractions = attractions;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    //methods
    public void touring(){
        for(String i : attractions){
            System.out.println("Touring "+i);
        }
    }

    //toString
    @Override
    public String toString() {
        return "SightseeingTour{" +
                "attractions=" + Arrays.toString(attractions) +
                ", city='" + city + '\'' +
                '}';
    }
}

