/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Predator
 */
public class DataIOStream {

    //DataInputStream/DataOutputStream are wrapper classes for normal in/out stream
    //These classes provide in/out for primitive typeห not just byte
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("binary2.dat");
        DataOutputStream out = new DataOutputStream(fos);//wrapping
        out.writeUTF("Hello Binary file. It's me, Mario!!");
        out.writeInt(20);
        out.writeDouble(181.2);
        out.writeChar('M');
        out.writeUTF("End Of File");
        out.close();//Note that FileOutputStream don't need to close
        System.out.println("Finished writing file");

        System.out.println("Start reading file");
        DataInputStream in = new DataInputStream(new FileInputStream("binary2.dat"));
        System.out.println("File size is: " + in.available() + " bytes");
        //Must use correct read method
        System.out.println(in.readUTF());
        System.out.println(in.readInt());
        System.out.println(in.readDouble());
        System.out.println(in.readChar());
        System.out.println(in.readUTF());
        in.close();
        System.out.println("Finished reading file");
    }
}
