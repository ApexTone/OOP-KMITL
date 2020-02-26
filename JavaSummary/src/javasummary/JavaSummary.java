/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasummary;

import java.util.Scanner;

/**
 * @author Predator
 */
public class JavaSummary {

    public static void main(String[] args) {
        seventh();
    }

    public static void first() {
        Scanner inputScanner = new Scanner(System.in);//Input 
        System.out.print("Enter int: ");
        int num1 = inputScanner.nextInt();//Assigning input value
        System.out.println("num1 is: " + num1);//Show value

        System.out.print("Enter double: ");
        double num2 = inputScanner.nextDouble();
        System.out.print("num2 is: " + num2);
        System.out.printf("%.3f\n", num2);//Using printf

        //Java default floating point value is double
        float f1 = 1.256f;//adding "f" or "F" tell it's double
        System.out.println(f1);

        Boolean b = 1 > 2;
        System.out.println(b);
    }

    public static void second() {
        double d = Math.random();//Make random number from [0.0, 1.0)
        System.out.println(d);
        d *= 10;
        System.out.println(d);

        int i = (int) (Math.random() * 100);//Cast to int
        System.out.println(i);

        //Random in range
        int start = 30, range = 20;
        double randDouble = start + (Math.random() * range);//Generate from [start,start+range)
        System.out.println(randDouble);

        char x = (char) ('a' + Math.random() * ('z' - 'a' + 1));
        System.out.println(x);
    }

    public static void third() {
        String s1 = "Welcome to java";
        System.out.println(s1);

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s2 = inputScanner.nextLine();//Get input until input with enter
        System.out.println(s2);
        s2 = inputScanner.next();//Get input until input with spacing
        System.out.println(s2);
    }

    public static void fourth() {
        String s = "456";
        Double d = Double.parseDouble(s);
        Integer i = Integer.parseInt(s);
        System.out.println(d);
        System.out.println(s + 200);//String concatenation: Equal to s+"200"
        System.out.println(i + 200);//Normal int sum        

        String s2 = i + "";//Convert int to String: String has higher priority
        System.out.println(s2);
    }

    //Overloading: Same name, different signature.
    public static double max(double a, double b) {
        System.out.println("In double max");
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        System.out.println("In int max");
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void fifth() {
        System.out.println(max(3, 2));
        System.out.println(max(3, 2));
    }

    /*
    //Ambiguous overloading: Produce logical error
    public static double maxA(int num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static double maxA(double num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void sixth() {
        System.out.println(maxA(3, 2));//Ambiguous
    }
    */
    public static void seventh() {
        //1D Array
        int[] arrays = new int[10];//Size 10 array
        System.out.println(arrays);//Showing addr
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i * 2;//Assiging value

        }
        for (int i : arrays) {//for each: loop all items in array without skipping
            System.out.print(i + " ");
        }
        System.out.println("");

        //2D Array
        int[][] arr2 = {//ragged array
            {2, 0, 3},
            {3, 4},
            {4, 5, 6, 7},
            {5, 6}
        };

        for (int i = 0; i < arr2.length; i++) {//Normal for loop
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }

        for (int[] is : arr2) {//for each for 2D array
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
