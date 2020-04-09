/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardInfoTable;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Predator
 */
public class InfoPane extends Pane{
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
        
        Button moreInfoButton = new Button("More Info");
        moreInfoButton.setOnAction(e->{
            Stage moreStage = new Stage();
            Scene moreScene = new Scene(new MoreCardInfoPane(creditCard),315,440);
            moreStage.setScene(moreScene);
            moreStage.initModality(Modality.APPLICATION_MODAL);
            moreStage.show();
        });
        
        HBox hBox = new HBox();
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(cardImageView,vBox,stateRect,moreInfoButton);
        
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
