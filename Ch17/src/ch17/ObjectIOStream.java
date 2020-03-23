/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Predator
 */
public class ObjectIOStream {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Circle c1 = new Circle(2.5);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("binary4.dat"));
        out.writeUTF("Someone");
        out.writeChar('F');
        out.writeObject(new Date());//Can write object
        out.writeObject(c1);
        out.close();
        System.out.println("Finished writing object");
        
        System.out.println("Start reading object");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("binary4.dat"));
        System.out.println(in.readUTF());
        System.out.println(in.readChar());
        System.out.println(in.readObject());
        Circle c2 = (Circle) in.readObject(); //reading object to object
        System.out.println(c2.getArea()); 
        System.out.println("Finished reading object");
        
        System.out.println(c1.sc);
        System.out.println(c2.sc);//note that it's null since it can't be write to/copy from file
    }
}

class Circle implements Serializable{ //Serializable interface to be able to write to file
    private double radius;
    public static int numberOfCircle=0;//static can't be serialize
    public transient SpecialCircle sc = new SpecialCircle(); //transient keyword will prevent serializing attempt
    
    public Circle() {
        numberOfCircle++;
    }
    public Circle(double radius) {
        this.radius = radius;
        numberOfCircle++;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}

class SpecialCircle{ //non Serializable class can't be written to file
    
}
