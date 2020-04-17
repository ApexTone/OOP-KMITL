/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransactionScene;

/**
 *
 * @author Predator
 */
import InfoScene.CreditCard;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TransactionScene extends Application{ //Create each file for each individual card and read to observable list
    private CreditCard creditCard = new CreditCard("12345678901234", "John", "Cena", LocalDate.parse("2020-04-30"), LocalDate.parse("2026-04-30"), "Credit", "Platinum", "100000", "OK");
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Transaction Scene");
        TransactionPane tp = new TransactionPane(creditCard); //add this action to button
        //System.out.println(creditCard.getBalance());
        
        Scene scene = new Scene(tp);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
