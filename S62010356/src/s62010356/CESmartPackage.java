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

public class CESmartPackage {
    //to Japan, 2 days 3 nights (per person)
    private String destination;
    private String company;
    private Hotel[] hotels;
    private Meal[] meals;
    private AirTicket ticket;
    private SightseeingTour sightseeingTour;

    //Constructor
    public CESmartPackage(){
    }
    public CESmartPackage(String destination, String company, Hotel[] hotels, Meal[] meals,  SightseeingTour sightseeingTour, AirTicket ticket) {
        this.destination = destination;
        this.company = company;
        this.hotels = hotels;
        this.meals = meals;
        this.ticket = ticket;
        this.sightseeingTour = sightseeingTour;
    }

    //getters/setters
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public Hotel[] getHotels() {
        return hotels;
    }
    public void setHotels(Hotel[] hotels) {
        this.hotels = hotels;
    }
    public Meal[] getMeals() {
        return meals;
    }
    public void setMeals(Meal[] meals) {
        this.meals = meals;
    }
    public AirTicket getTicket() {
        return ticket;
    }
    public void setTicket(AirTicket ticket) {
        this.ticket = ticket;
    }
    public SightseeingTour getSightseeingTour() {
        return sightseeingTour;
    }
    public void setSightseeingTour(SightseeingTour sightseeingTour) {
        this.sightseeingTour = sightseeingTour;
    }

    //Methods
    public int getTourPrice(){
        int price=0;
        for (int i=0;i<meals.length;i++){
            price+=meals[i].getPrice();
        }
        for(int i=0;i<hotels.length;i++){
            price+=hotels[i].getPricePerDay();
        }
        price+=ticket.getPrice();
        return price;
    }


    @Override
    public String toString() {
        return "CESmartPackage{" +
                "destination='" + destination + '\'' +
                ", company='" + company + '\'' +
                ", hotels=" + Arrays.toString(hotels) +
                ", meals=" + Arrays.toString(meals) +
                ", ticket=" + ticket +
                ", sightseeingTour=" + sightseeingTour +
                '}';
    }
}

