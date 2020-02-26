/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loneclass;

/**
 *
 * @author Predator
 */
public class LoneClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarLeasing p = new CarLeasing("Corona", 109900, 1099000, 48, 27.7745);
        System.out.println(p.getMonthlyPayment());
        System.out.println(p.getTotalPayment());
    }
    
}
