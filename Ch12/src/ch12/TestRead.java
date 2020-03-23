/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Predator
 */
public class TestRead {
    public static void main(String[] args) {
        File file = new File("Test.txt");
        try {
            Scanner input = new Scanner(file);//Use Scanner to read File
            ArrayList<String> list = new ArrayList<>();
            while(input.hasNext()){
                list.add(input.next());
            }
            
            for (String word : list) {
                System.out.print(word+" ");
            }
            
            input.close();//Don't need to close the read file
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
