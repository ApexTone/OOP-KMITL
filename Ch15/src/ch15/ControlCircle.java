/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Predator
 */
public class ControlCircle extends Application {

    CirclePane c1 = new CirclePane();

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Controlling circle with buttons");

        Button enlButton = new Button("Enlarge");
        Button shrButton = new Button("Shrink");
        //Set event handling using anonymous inner class
        //Anonymous inner class must always implements/extends something
        enlButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                if (c1.getRadius() < 70.0) {
                    c1.enlarge();
                }
            }
        });
        //using lambda expression
        shrButton.setOnAction((ActionEvent t) -> {
            if (c1.getRadius() > 10.0) {
                c1.shrink();
            }
        });

        //Add buttons to HBox
        HBox hBox = new HBox(20);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(enlButton, shrButton);

        //Add StackPane and HBox to BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(c1);
        borderPane.setBottom(hBox);

        //Add BorderPane to scene
        Scene scene = new Scene(borderPane, 400, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class CirclePane extends StackPane { //Create StackPane with Circle inside

    private Circle circle = new Circle(30.0);

    public CirclePane() {
        setAlignment(Pos.CENTER);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        getChildren().add(circle);
    }

    public double getRadius() {
        return circle.getRadius();
    }

    public void setRadius(double r) {
        circle.setRadius(r);
    }

    public void enlarge() {
        setRadius(circle.getRadius() + 2);
    }

    public void shrink() {
        setRadius(circle.getRadius() - 2);
    }
}
