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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
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
        
        /*Label listName = new Label("Information of card holder");
        listName.setFont(new Font("Arial", 20));
        //Using ListView + HBox here instead
        ListView nameList = new ListView();
        nameList.getItems().addAll("Serial","Name","Expire Date","Company","Type","Level","Money","State","Start Date");
        
        ListView valueList = new ListView();
        //read from text file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("CardInfoDatabase.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");//split at ','
                //System.out.println(Arrays.toString(data));
                for(int i=0;i<data.length;i++){
                    valueList.getItems().add(data[i]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("CardInfo Database can't be found");
        } catch (IOException ex) {
            System.out.println("IO exception smt");
        }   

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(nameList,valueList);
        
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(5));
        vBox.getChildren().addAll(listName,hBox);
        */
        MoreCardInfoPane morePane = new MoreCardInfoPane(new CreditCard(STYLESHEET_CASPIAN, STYLESHEET_CASPIAN, STYLESHEET_MODENA, STYLESHEET_MODENA, STYLESHEET_CASPIAN, STYLESHEET_MODENA, STYLESHEET_MODENA, STYLESHEET_MODENA, STYLESHEET_MODENA, STYLESHEET_MODENA));

        Scene scene = new Scene(morePane,315,440);
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
