/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Predator
 */
public class BufferedIOStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Copying binary2.dat to binary3.dat");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("binary2.dat"));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("binary3.dat"));
        int nByte = 0;
        while (in.available() != 0) {
            out.write(in.read());
            nByte++;
        }
        out.close();
        in.close();
        System.out.println(nByte);//checking if binary3.dat has same size as binary2.dat
    
        System.out.println("Read binary3.dat");
        DataInputStream dataIn = new DataInputStream(new FileInputStream("binary3.dat"));
        System.out.println(dataIn.readUTF());
        System.out.println(dataIn.readInt());
        System.out.println(dataIn.readDouble());
        System.out.println(dataIn.readChar());
        System.out.println(dataIn.readUTF());
    }
}
