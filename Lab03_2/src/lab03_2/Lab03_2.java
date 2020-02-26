/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_2;

/**
 *
 * @author Predator
 */
public class Lab03_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account("TK", 1234, 5000);
        SavingsAccount a2 = new SavingsAccount("Tanapol", 1234, 5000);
        CheckingAccount a3 = new CheckingAccount("Tanapol", 1234, 5000);
        PriviledgedAccount a4 = new PriviledgedAccount(1000,"Tanapol", 1234, 5000);
        
        System.out.println(a1);
        //System.out.println(a1.getMonthlyInterest());
        System.out.println(a2);
        //System.out.println(a2.getMonthlyInterest());
        System.out.println(a3);
        //System.out.println(a3.getMonthlyInterest());
        System.out.println(a4);
        //System.out.println(a4.getMonthlyInterest());
        //a4.withdraw(6000);
        //System.out.println(a4);
    }
    
}
