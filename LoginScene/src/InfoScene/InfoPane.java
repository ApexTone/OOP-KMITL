/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoScene;

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
    
    private Rectangle stateRect = new Rectangle(20, 30);
    private Label nameLabel=new Label(),serialLabel=new Label();
    private Image cardImage = new Image("https://www.americanexpress.com/content/dam/amex/th/home-page/cards/Card_Art_full_size/THAI_Co-brand_2008.png");
    private Button moreInfoButton = new Button("More Info");
    public InfoPane(){
        moreInfoButton.setOnAction(e->{
            Stage moreStage = new Stage();
            Scene moreScene = new Scene(new MoreCardInfoPane(creditCard),315,440);
            moreStage.setTitle("Full Card Info");
            moreStage.setScene(moreScene);
            moreStage.initModality(Modality.APPLICATION_MODAL);
            moreStage.show();
        });
    }
    public InfoPane(CreditCard creditCard){
        this.creditCard = creditCard;
        moreInfoButton.setOnAction(e->{
            Stage moreStage = new Stage();
            Scene moreScene = new Scene(new MoreCardInfoPane(creditCard),315,440);
            moreStage.setTitle("Full Card Info");
            moreStage.setScene(moreScene);
            moreStage.initModality(Modality.APPLICATION_MODAL);
            moreStage.show();
        });
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
        paintInfo();
    }
    public CreditCard getCreditCard() {
        return creditCard;
    }
    
    
    
    public void paintInfo(){
        ImageView cardImageView = new ImageView(cardImage);
        cardImageView.setPreserveRatio(true);
        cardImageView.setFitHeight(50);
        
        nameLabel.setText(creditCard.getName());
        serialLabel.setText(creditCard.getSerial());
        VBox vBox = new VBox();
        vBox.setSpacing(5);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(nameLabel,serialLabel);
        
        stateRect.setStroke(Color.BLACK);
        if("OK".equalsIgnoreCase(creditCard.getState())){
            stateRect.setFill(Color.GREEN);
        }
        else{
            stateRect.setFill(Color.RED);
        }

        
        HBox hBox = new HBox();
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(cardImageView,vBox,stateRect,moreInfoButton);
        
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
