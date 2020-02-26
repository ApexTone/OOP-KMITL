/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcomposition;

import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author Predator
 */
public class ClassComposition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student("TK","6201036", "Engineering", "CE", LocalDateTime.of(2000, Month.NOVEMBER, 27, 12, 00));
        System.out.println(s);
        s.addCouse(new Course("ABC", "123", "NANANA",3));
        s.addCouse(new Course("ZXY", "456", "BLABLABLA",3));
        System.out.println(s);
    }
    
}
