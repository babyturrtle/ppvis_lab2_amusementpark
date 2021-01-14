package view;

import user.*;
import model.*;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import java.util.List;

public class Shop {
    List<Customer> customers;
    public Administrator admin;
    public ObservableList<Merchandise> merchandises;
    ListView<String> list = new ListView<String>();
    public ObservableList<String> merchId;
    Button goBackButton;
    Button viewMerchandise;
    Button pickButton;
    Button buyTicketButton;
    Button attachTicketButton;
    Button attachCouponButton;
    Stage shopStage;

    public Shop() {
        shopStage = new Stage();
        VBox root = new VBox();
        root.setSpacing(5);
        root.setAlignment(Pos.CENTER);
        shopStage.setTitle("Show Park");
        goBackButton = new Button("Go Back");
        viewMerchandise = new Button("View Merchandise");
        pickButton=new Button("Pick");
        buyTicketButton=new Button ("Buy Ticket");
        attachCouponButton=new Button("Attach Coupon");
        attachTicketButton=new Button("Attach Ticket");
        list.setItems(merchId);
        root.getChildren().addAll(list,
                goBackButton,
                viewMerchandise,
                pickButton,
                buyTicketButton,
                attachCouponButton,
                attachTicketButton);
        shopStage.setScene(new Scene(root,200,400));
        goBackButton.setOnAction(e->{
            goBack();
        });
        viewMerchandise.setOnAction(e->{
            showMerchandise();
        });
        pickButton.setOnAction(e->{
            pick();
        });
        buyTicketButton.setOnAction(e->{
            buyTicket();
        });
        attachTicketButton.setOnAction(e->{
            attachTicket();
        });
        attachCouponButton.setOnAction(e->{
            attachCoupon();
        });
    }

    public ObservableList<Merchandise> getMerchandises() {
        return merchandises;
    }

    public void setMerchandises(ObservableList<Merchandise> merchandises) {
        this.merchandises = merchandises;
    }

    public void goBack(){
        CustomerRegistrator customerRegistrator = new CustomerRegistrator();
    }

    public void pick(){

    }

    public void showShop(){
        getMerchandises();
        for (Merchandise merchandise: merchandises){
            merchandise.getId();
            merchId.add("Merchandise" + merchandise.getId());
        }
    }

    public void showMerchandise(){
    }

    public void buyTicket(){

    }

    public void attachTicket(){

    }

    public void attachCoupon(){

    }
}