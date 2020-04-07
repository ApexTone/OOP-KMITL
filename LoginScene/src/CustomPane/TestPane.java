/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomPane;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import CreditCardInfoTable.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Predator
 */
public class TestPane extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        InfoPane pane = new InfoPane(new CreditCard("123456789012","CCV","John Cena","04/20","Aeon","Credit","Gold","100000","OK","05/15"));
        Scene scene = new Scene(pane,200,300);
        stage.setScene(scene);
        stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}

class InfoPane extends Pane{
    private CreditCard creditCard;
    
    public InfoPane(){
    }
    public InfoPane(CreditCard creditCard){
        this.creditCard = creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
        paintInfo();
    }
    public CreditCard getCreditCard() {
        return creditCard;
    }
    
    
    
    public void paintInfo(){
        Image cardImage = new Image("https://www.americanexpress.com/content/dam/amex/th/home-page/cards/Card_Art_full_size/THAI_Co-brand_2008.png");
        ImageView cardImageView = new ImageView(cardImage);
        cardImageView.setPreserveRatio(true);
        cardImageView.setFitHeight(50);
        
        Label nameLabel = new Label(creditCard.getName());
        Label serialLabel = new Label(creditCard.getSerial());
        VBox vBox = new VBox();
        vBox.setSpacing(5);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(nameLabel,serialLabel);
        
        Rectangle stateRect = new Rectangle(20, 30);
        stateRect.setStroke(Color.BLACK);
        if(creditCard.getState()=="OK"){
            stateRect.setFill(Color.GREEN);
        }
        else{
            stateRect.setFill(Color.RED);
        }
        
        HBox hBox = new HBox();
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(cardImageView,vBox,stateRect);
        
        getChildren().clear();
        setPadding(new Insets(10));
        getChildren().addAll(hBox);
    }
    
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        paintInfo();
    }
    @Override
    public void setHeight(double height){
        super.setHeight(height);
        paintInfo();
    }
}
