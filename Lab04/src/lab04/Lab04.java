/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Scanner;

/**
 *
 * @author Predator
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Input your id: ");
        Scanner s = new Scanner(System.in);
        String id = s.nextLine();
        ATM atm = new ATM(new Account_Simplify(id,0));
        atm.startATM();
    }
    
}
