package loginscene;

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoginScene extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Login page");
        
        Image creditCardImage = new Image("https://upload.wikimedia.org/wikipedia/commons/4/4f/Credit-cards.jpg");
        ImageView creditCardImageView = new ImageView(creditCardImage);
        creditCardImageView.setFitHeight(150);
        creditCardImageView.setPreserveRatio(true);
        
        Button loginButton = new Button("Login");
        Button clearButton = new Button("Clear");

        Label statusLabel = new Label("");
        
        TextField usernameField = new TextField();
        usernameField.setPromptText("username");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("password");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(5)); //adding "edge" area
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.add(creditCardImageView,1,0);
        grid.add(new Label("Username"), 0, 1); //item, column, row
        grid.add(usernameField, 1, 1);
        grid.add(new Label("Password"), 0,2);
        grid.add(passwordField, 1, 2);
        
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        hBox.getChildren().addAll(loginButton,clearButton);
        grid.add(hBox, 1, 3);
        grid.add(statusLabel, 1,4);

        loginButton.setOnAction(e -> {
            String userString = usernameField.getCharacters().toString();
            String passwordString = passwordField.getCharacters().toString();
            if (!userString.equals("") && !passwordString.equals("")) { //both datafield can't be null

                try {
                    BufferedReader reader = new BufferedReader(new FileReader("UserDatabase.txt"));
                    String line = "";
                    boolean foundUsername = false;
                    while ((line = reader.readLine()) != null) {
                        String[] data = line.split(",");//split at ','
                        if (data[1].equals(userString)) {
                            foundUsername = true;
                            if (data[2].equals(passwordString)) {
                                //System.out.println("Login success");
                                statusLabel.setText("Login success");
                                AlertBox.display("Mission pass", "Respect+");
                            } else {
                                //System.out.println("Wrong password");
                                statusLabel.setText("Incorrect password");
                            }
                            break;
                        }
                    }
                    if (!foundUsername) {
                        //System.out.println("Username not found");
                        statusLabel.setText("Username not found");
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                //System.out.println("Missing data in either field");
                statusLabel.setText("Missing data field(s)");
            }
            usernameField.clear();
            passwordField.clear();
        });
        clearButton.setOnAction(e->{
            usernameField.clear();
            passwordField.clear();
            statusLabel.setText("");
        });

        BorderPane pane = new BorderPane();
        pane.setCenter(grid);

        Scene loginScene = new Scene(pane, 500, 400);
        stage.setScene(loginScene);
        stage.show();
    }

    public static void createMockDatabase() {//creat mock database
        File file = new File("UserDatabase.txt");
        System.out.println(file.exists());
        char splitter = ',';
        try {
            PrintWriter output = new PrintWriter(file);//init PrintWriter (File writer)
            output.print("John Cena");//Name
            output.print(splitter);//splitter
            output.print("johniscool");//user
            output.print(splitter);//splitter
            output.println("youcantseeme");//pass
            output.close();//Close file to "save" and for "safety"
        } catch (FileNotFoundException ex) {
            System.out.println("Username Database can't be found/create");
        }
    }

    public static void testCSV() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("UserDatabase.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");//split at ','
                System.out.println(Arrays.toString(data));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Username Database can't be found");
        } catch (IOException ex) {
            System.out.println("IO exception smt");
        }
    }

    public static void main(String[] args) {
        //createMockDatabase();
        launch(args);
    }
}
