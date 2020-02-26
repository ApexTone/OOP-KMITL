/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_1;

/**
 *
 * @author Predator
 */
public class Lab03_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a = new Account("Tanapol", 1234, 5000);
        a.deposit(5000);
        a.deposit(200);
        a.withdraw(50);
        System.out.println(a.getTransactionData());
    }
    
}
