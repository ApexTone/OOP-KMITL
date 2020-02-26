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

public class Meal {
    public static final int streetFood=1,hotelMeal=2,restaurant=3;
    private String name;
    private String[] menu;
    private int type;

    //Constructor
    public Meal(){
    }
    public Meal(String name, String[] menu, int type) {
        this.name = name;
        this.menu = menu;
        this.type = type;
    }

    //getters/setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getMenu() {
        return menu;
    }
    public void setMenu(String[] menu) {
        this.menu = menu;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        if(type==streetFood || type==hotelMeal || type==restaurant){
            this.type=type;
        }
        else {
            System.out.println("Invalid meal type");
        }
    }

    //method
    public int getPrice(){
        if(type==streetFood){
            return 200;
        }
        else if(type==hotelMeal){
            return 500;
        }
        else if(type==restaurant){
            return 1000;
        }
        else {
            System.out.println("Invalid meal type");
            return -1;
        }
    }

    //toString
    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", menu=" + Arrays.toString(menu) +
                ", type=" + type +
                '}';
    }
}

