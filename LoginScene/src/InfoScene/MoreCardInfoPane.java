/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoScene;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author Predator
 */
public class MoreCardInfoPane extends Pane {
    private CreditCard creditCard = new CreditCard();
    private ListView nameList = new ListView(), valueList = new ListView();
    private Label listName = new Label("Information of card holder");
    private Button toggleStatusButton = new Button("Toggle Status");

    public MoreCardInfoPane(CreditCard creditCard) {
        listName.setFont(new Font("Arial", 20));
        nameList.getItems().addAll("Serial", "CCV", "Name", "Surname", "Issue Date", "Expiry Date", "Type", "Tier", "Money Boundary", "State");
        nameList.setMaxWidth(150);
        valueList.setMaxWidth(150);
        this.creditCard = creditCard;
        valueList.getItems().addAll(//must invoke once
                creditCard.getSerial(),
                creditCard.getCcv(),
                creditCard.getName(),
                creditCard.getSurname(),
                creditCard.getIssueDate().toString(),
                creditCard.getExpiryDate().toString(),
                creditCard.getType(),
                creditCard.getTier(),
                creditCard.getMoneyBoundary(),
                creditCard.getState()
        ); 
    }


    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void paintMoreCardInfo() {
        toggleStatusButton.setOnAction(e->{
            if(creditCard.getState().equalsIgnoreCase("normal")){
                System.out.println("to forfeit");
                creditCard.setState("forfeit");
            }
            else{
                System.out.println("to normal");
                creditCard.setState("normal");
            }
        });
        
        HBox hBox = new HBox();
        HBox topHBox = new HBox();
        
        toggleStatusButton.setText("Toggle Status");
        topHBox.getChildren().addAll(listName,toggleStatusButton);
        topHBox.setSpacing(5);
        
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(nameList, valueList);
        
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(5));
        
        vBox.getChildren().addAll(topHBox,hBox);
         
        getChildren().clear();
        getChildren().add(vBox);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paintMoreCardInfo();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paintMoreCardInfo();
    }

}
