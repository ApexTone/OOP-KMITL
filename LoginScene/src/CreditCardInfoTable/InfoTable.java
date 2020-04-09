/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardInfoTable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Predator
 */
public class InfoTable extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("InfoLists");
        stage.setResizable(false);
        
        InfoPane infoPane = new InfoPane(new CreditCard("123456789012","CCV","John Cena","04/20","Aeon","Credit","Gold","100000","OK","05/15"));

        Scene scene = new Scene(infoPane,400,500);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void createMockDatabase() {//creat mock database
        File file = new File("CardInfoDatabase.txt");
        System.out.println(file.exists());
        char splitter = ',';
        try {
            PrintWriter output = new PrintWriter(file);//init PrintWriter (File writer)
            output.print("123456789012");
            output.print(splitter);
            output.print("John Cena");
            output.print(splitter);
            output.print("04/20");
            output.print(splitter);
            output.print("Aeon");
            output.print(splitter);
            output.print("Credit");
            output.print(splitter);
            output.print("Gold");
            output.print(splitter);
            output.print("100000");
            output.print(splitter);
            output.print("OK");
            output.print(splitter);
            output.print("05/15");
            output.close();//Close file to "save" and for "safety"
        } catch (FileNotFoundException ex) {
            System.out.println("CardInfo Database can't be found/create");
        }
    }

    public static void testCSV() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("CardInfoDatabase.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");//split at ','
                System.out.println(Arrays.toString(data));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("CardInfo Database can't be found");
        } catch (IOException ex) {
            System.out.println("IO exception smt");
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
