/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s62010356;

import java.util.Scanner;

/**
 *
 * @author Predator
 */
public class S62010356 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your tour type: 1 for custom, 2 for set tour. Else to turn off");
        switch (scanner.nextInt()){
            case 1: customTour(); break;
            case 2: setTour(); break;
            default:
                System.out.println("Power off");
        }
    }

    public static void setTour(){
        String[] menuItem = {"cake","coke","pepsi"};
        Meal m1 = new Meal("na",menuItem,Meal.streetFood);
        Meal m2= new Meal("na",menuItem,Meal.restaurant);
        Meal m3 = new Meal("na",menuItem,Meal.hotelMeal);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = scanner.nextLine();
        System.out.println("Your plane seat:");
        String seat = scanner.nextLine();
        AirTicket ticket = new AirTicket("Thai",seat,name,AirTicket.economy);
        Hotel hotel1 = new Hotel("Hotel1","Tokyo",50,Hotel.fourStar);
        Hotel hotel2 = new Hotel("Hotel2","Nagasaki",100,Hotel.fiveStar);
        Hotel hotel3 = new Hotel("Hotel3","Osaka",20,Hotel.triStar);

        Hotel[] hotels = {hotel1,hotel2,hotel3};
        Meal[] meals = {m1,m2,m3};
        String[] attr = {"Shibuya","Nagasaki","Skytree"};
        CESmartPackage tour = new CESmartPackage("Japan","Company",hotels,meals,new SightseeingTour(attr,"Tokyo"),ticket);
        System.out.println(tour);
    }
    public static void customTour(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = scanner.nextLine();
        System.out.println("Your plane seat:");
        String seat = scanner.nextLine();
        System.out.println("Plane class 1=firstClass 2=business 3=economy : ");
        int type = scanner.nextInt();
        AirTicket airTicket = new AirTicket("Thai",seat,name,type);

        scanner.nextLine();
        System.out.println("Select your meal type(8 meals) 1=street 2=hotel 3=restaurant: ");
        int[] mealType= new int[8];
        for(int i=0;i<8;i++){
            mealType[i]=scanner.nextInt();
        }
        String[] menuItem = {"cake","coke","pepsi","steak","sushi","beer","whiskey","wagyu"};
        Meal[] allMeals = new Meal[8];
        for(int i=0;i<8;i++){
            allMeals[i] = new Meal("Mealer",menuItem,mealType[i]);
        }

        System.out.println("Select your hotel type(3 hotel) 3-5 stars: ");
        int[] hotelType= new int[3];
        for(int i=0;i<3;i++){
            hotelType[i]=scanner.nextInt();
        }
        Hotel[] allHotels = new Hotel[3];
        for(int i=0;i<3;i++){
            allHotels[i] = new Hotel("Hotel","Japan",(int)Math.random()*100,hotelType[i]);
        }

        scanner.nextLine();
        System.out.println("Name a city to tour: ");
        String city = scanner.nextLine();
        System.out.println("Name 3 attractions: ");
        String[] attractions = new String[3];
        for(int i=0;i<3;i++){
            attractions[i] = scanner.nextLine();
        }
        SightseeingTour sightseeingTour = new SightseeingTour(attractions,city);

        CESmartPackage tour = new CESmartPackage("Japan","Company",allHotels,allMeals,sightseeingTour,airTicket);
        System.out.println(tour);
    }
    
}
