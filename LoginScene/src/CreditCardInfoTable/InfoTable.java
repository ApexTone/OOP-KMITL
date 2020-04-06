/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardInfoTable;

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
        
        Label listName = new Label("Information of card holder");
        listName.setFont(new Font("Arial", 20));
        //Using ListView + HBox here instead
        ListView nameList = new ListView();
        nameList.getItems().addAll("Serial","Name","Expire Date","Company","Type","Level","Money","State","Start Date");
        
        ListView valueList = new ListView();
        valueList.getItems().addAll("123456789012","Tanapol Wong-asa","04/20",CreditCard.AEON,"Credit",CreditCard.SILVER,"100000","OK","05/15");

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(nameList,valueList);
        
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(5));
        vBox.getChildren().addAll(listName,hBox);
        
        Scene scene = new Scene(vBox,300,600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
