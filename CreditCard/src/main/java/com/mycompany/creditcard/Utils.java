package com.mycompany.creditcard;

public class Utils {

    static String fileLocation = "C:\\Users\\\\Tree\\Desktop\\CreditCard\\list.csv";
    
    public static String capitalizedFirstChar(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static String removeAllNonNumeric(String s) {
        return s.replaceAll("[\\D]", "");
    }
}
