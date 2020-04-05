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
        //Using ListView here instead
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
