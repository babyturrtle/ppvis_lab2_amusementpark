package view;

import user.*;
import model.Attraction;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import java.util.List;

public class Park {
    List<Customer> customers;
    public Administrator admin;
    public ObservableList<Attraction> attractions;
    ListView<String> list = new ListView<String>();
    public ObservableList<String> attractionsId;
    Button goBackButton;
    Button viewAttraction;
    Button pickButton;
    Button shopButton;
    Stage parkStage;

    public Park() {
        parkStage = new Stage();
        VBox root = new VBox();
        root.setSpacing(5);
        root.setAlignment(Pos.CENTER);
        parkStage.setTitle("Show Park");
        goBackButton = new Button("Go Back");
        shopButton = new Button("Buy Merch");
        viewAttraction = new Button("View Attraction");
        pickButton=new Button("Pick");
        list.setItems(attractionsId);
        root.getChildren().addAll(list,
                goBackButton,
                shopButton,
                viewAttraction,
                pickButton);
        parkStage.setScene(new Scene(root,200,400));
        goBackButton.setOnAction(e->{
            goBack();
        });
        shopButton.setOnAction(e->{
            buyMerch();
        });
        viewAttraction.setOnAction(e->{
            showAttraction();
        });
        pickButton.setOnAction(e->{
            pick();
        });
    }

    public ObservableList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ObservableList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public void goBack(){
        CustomerRegistrator customerRegistrator = new CustomerRegistrator();
    }

    public void pick(){

    }

    public void buyMerch(){
        Shop shop = new Shop();
    }

    public void showPark(){
        getAttractions();
        for (Attraction attraction: attractions){
            attraction.getId();
            attractionsId.add("Attraction" + attraction.getId());
        }
    }

    public void showAttraction(){
    }
}


//goBack(): void
//pick(): void
//buyMerch(): void
//showPark(): void{event}
//showAttraction(): void{event}

//view:: view attractions
//buyTicket:: buy ticket window
//attachTicket:: register tickets window
//attachCoupon:: attach coupons window
//registerCoupon:: register coupons window
//pick:: guidance window
//Shop::showALl:: show shop

//customers[]
//admin
//attractions[]