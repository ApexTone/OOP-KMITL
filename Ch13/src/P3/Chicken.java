/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;

/**
 *
 * @author Predator
 */
class Chicken extends Animal implements Edible{//extending abstract class and implementing interface at the same time

    @Override
    public String howToEat() {
        return "Bake it, eat it";
    }

    @Override
    public String sound() {
        return "8388";
    }
    
}
