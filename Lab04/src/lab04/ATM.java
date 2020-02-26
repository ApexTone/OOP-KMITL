/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Predator
 */
public class ATM {
    private Account_Simplify acc;
    
    //Constructor
    public ATM() {
    }
    public ATM(Account_Simplify acc) {
        this.acc = acc;
    }

    //Setter
    public void setAcc(Account_Simplify acc) {
        this.acc = acc;
    }
    
    //Method
    public void startATM() throws InputMismatchException{
        Scanner scan = new Scanner(System.in);
        start: while (true) {      
            System.out.println("\n------------------------------");
            System.out.println("Main Menu");
            System.out.println("1: Check account balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try{
                int choice = scan.nextInt();
                switch(choice){
                    case 1:
                        System.out.println(acc.getBalance());
                        scan.nextLine();
                        scan.nextLine();
                        break;
                    case 2:
                        System.out.print("How much to withdraw: ");
                        double w = scan.nextDouble();
                        acc.withdraw(w);
                        break;
                    case 3:
                        System.out.print("How much to deposit: ");
                        double d = scan.nextDouble();
                        acc.deposit(d);
                        break;
                    case 4:
                        System.out.println("Good bye");
                        break start; //Quit main process
                    default:
                        System.out.println("That's not a viable option!");
                }
            }catch(InputMismatchException e){
                System.out.println("Enter a number!");
                scan.nextLine();
            }
            
        }
    }
}
