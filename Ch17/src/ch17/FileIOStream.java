package ch17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream out = new FileOutputStream("binary1.dat");//.dat for binary file
        for (int i = 0; i < 10; i++) {
            out.write(i);//write byte to file
        }
        out.close();//close file
        System.out.println("Finished writing file");

        System.out.println("Start reading file");
        FileInputStream in = new FileInputStream("binary1.dat");
        System.out.println("File size is: " + in.available() + " bytes");
        while(in.available() != 0){ //available() return 0 after passing EOF
            System.out.println(in.read());
        }
        in.close();
        System.out.println("Finished reading file");
    }
}
