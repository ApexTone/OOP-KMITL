/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransactionScene;

import InfoScene.CreditCard;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author Predator
 */
public class TransactionPane extends Pane{
    private CreditCard creditCard;
    private Label nameLabel = new Label();
    private TableView tableView;

    //TODO: add sum paidAmount and balance(+set to creditCard)
    
    public TransactionPane(CreditCard creditCard) {
        this.creditCard = creditCard;
        
        nameLabel.setText("Transaction List");
        nameLabel.setFont(new Font("Arial",20));
        
        //read then add file to TableView as ObservableList
        /*
            code
        */
        //Mock transaction list
        ObservableList<Transaction> transactionList = FXCollections.observableArrayList();
        transactionList.add(new Transaction(this.creditCard, "Dunder Mifflin", "Paper", new Double("230"), LocalDate.parse("2020-05-05")));
        transactionList.add(new Transaction(this.creditCard, "Copy shop", "Printing", new Double("500"), LocalDate.parse("2020-05-20")));
        
        //Setting column and binding value
        TableColumn<Transaction,String> shopColumn = new TableColumn<>("Shop");
        shopColumn.setMinWidth(200);
        shopColumn.setCellValueFactory(new PropertyValueFactory<>("shopName"));
        TableColumn<Transaction,String> itemColumn = new TableColumn<>("Item");
        itemColumn.setMinWidth(200);
        itemColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        TableColumn<Transaction,Double> paidColumn = new TableColumn<>("Paid Amount");
        paidColumn.setMinWidth(200);
        paidColumn.setCellValueFactory(new PropertyValueFactory<>("paidAmount"));
        TableColumn<Transaction,LocalDate> transactionDateColumn = new TableColumn<>("Transaction Date");
        transactionDateColumn.setMinWidth(200);
        transactionDateColumn.setCellValueFactory(new PropertyValueFactory<>("transactionDate"));
        transactionDateColumn.setSortType(TableColumn.SortType.ASCENDING);
        
        //Init TableView
        tableView = new TableView(transactionList);
        tableView.getColumns().addAll(transactionDateColumn,shopColumn,itemColumn,paidColumn);
        tableView.getSortOrder().add(transactionDateColumn);//Make it sort by transaction date by default
    }

    
    
    public void paintTransactionTable(){
        VBox vBox = new VBox();
        vBox.setSpacing(5);
        vBox.getChildren().addAll(nameLabel,tableView);
        
        getChildren().add(vBox);
    }
    
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        paintTransactionTable();
    }
    @Override
    public void setHeight(double height){
        super.setHeight(height);
        paintTransactionTable();
    }
}
