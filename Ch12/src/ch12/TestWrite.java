/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Predator
 */
public class TestWrite {
    public static void main(String[] args) {
        File file = new File("Test.txt");//Dealing with file property
        System.out.println(file.exists());
     
        try {
            PrintWriter output = new PrintWriter(file);//Can use to create new file
            output.print("Hello ");
            output.println("Java");
            output.println("New Line!");
            
            output.close();//Close file to "save"
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
       
        //Old data get overrides
        try {
            try (PrintWriter output = new PrintWriter(file)) {
                output.print("Hello ");
                output.println("Java");
                output.println("New Line!");
                //Try with resource don't need to close!
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
