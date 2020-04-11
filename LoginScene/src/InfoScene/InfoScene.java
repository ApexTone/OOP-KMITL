/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoScene;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Predator
 */
public class InfoScene extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("InfoLists");
        stage.setResizable(false);
        VBox vBox = new VBox();
/*
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> {
            System.out.println("Adding...");
            vBox.getChildren().add(new MoreCardInfoPane(new CreditCard("12345678901234", "John", "Cena", LocalDate.parse("2020-04-30"), LocalDate.parse("2026-04-30"), "Credit", "Platinum", "100000", "OK")));
            //vBox.getChildren().add(new InfoPane(new CreditCard("12345678901234", "John", "Cena", LocalDate.parse("2020-04-30"), LocalDate.parse("2026-04-30"), "Credit", "Platinum", "100000", "OK")));
        });
        vBox.getChildren().add(addButton);
*/
        vBox.getChildren().add(new MoreCardInfoPane(new CreditCard("12345678901234", "John", "Cena", LocalDate.parse("2020-04-30"), LocalDate.parse("2026-04-30"), "Credit", "Platinum", "100000", "OK")));
        
        Scene scene = new Scene(vBox, 300, 500);
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
            output.print("2020-04-30");
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
            output.print("2026-04-30");
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
