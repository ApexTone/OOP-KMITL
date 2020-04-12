/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Predator
 */
public class HandleEvent extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Button handling");

        //create 2 new buttons
        Button okBtn = new Button("OK");
        Button cancelBtn = new Button("Cancel");

        //create EventHandler<> for each button and set responsive action
        okHandler h1 = new okHandler();
        okBtn.setOnAction(h1);
        cancelHandler h2 = new cancelHandler();
        cancelBtn.setOnAction(h2);

        //create hBox to place buttons in
        HBox hBox = new HBox(10);//HBox with spacing between each element
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(okBtn, cancelBtn);

        //create scene and set scene
        Scene scene = new Scene(hBox, 400, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private class okHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            System.out.println("OK pressed");
        }
    }

    private class cancelHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            System.out.println("Cancel pressed");
        }

    }

}
