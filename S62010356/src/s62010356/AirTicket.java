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
public class AirTicket {
    public static final int firstClass=1,business=2,economy=3;
    private String airline;
    private String seatNumber;
    private String passengerName;
    private int classLevel;

    //Constructor
    public AirTicket(){
    }
    public AirTicket(String airline, String seatNumber, String passengerName, int classLevel) {
        this.airline = airline;
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;
        setClassLevel(classLevel);
    }

    //Getters/setters
    /*
    * Passenger name and airline name shouldn't be change. So no setter method.
    */
    public String getAirline() {
        return airline;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setClassLevel(int classLevel) {
        if(classLevel==firstClass || classLevel==business || classLevel==economy){
            this.classLevel=classLevel;
        }
        else {
            System.out.println("Invalid class level");
        }
    }
    public int getClassLevel() {
        return classLevel;
    }

    //method
    public int getPrice(){
        if(classLevel==firstClass){
            return 20000;
        }
        else if(classLevel==business){
            return  7500;
        }
        else if(classLevel==economy){
            return 5000;
        }
        else {
            System.out.println("Invalid class level");
            return -1;
        }
    }


    //toString
    @Override
    public String toString() {
        return "AirTicket{" +
                "airline= '" + airline + "'" +
                ", seatNumber='" + seatNumber + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", classLevel=" + classLevel +
                '}';
    }
}

