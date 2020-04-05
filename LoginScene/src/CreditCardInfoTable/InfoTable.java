/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardInfoTable;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Predator
 */
public class InfoTable extends Application {

    final double MAX_WIDTH = 250;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("InfoLists");
        stage.setResizable(false);
        /* //Table don't seems to fit -> use ListView instead
        Label tableNameLabel = new Label("Credit card info");
        
        tableNameLabel.setTextAlignment(TextAlignment.CENTER);
        
        TableView infoTable = new TableView();
        TableColumn listColumn = new TableColumn("List");
        listColumn.setMinWidth(MAX_WIDTH/2);
        
        TableColumn valueColumn = new TableColumn("Value");
        valueColumn.setMinWidth(MAX_WIDTH/2);
        
        infoTable.getColumns().addAll(listColumn,valueColumn);
        
        VBox vBox = new VBox();
        vBox.getChildren().addAll(tableNameLabel,infoTable);
        Scene scene = new Scene(vBox,MAX_WIDTH,500);
        stage.setScene(scene);
         */
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
