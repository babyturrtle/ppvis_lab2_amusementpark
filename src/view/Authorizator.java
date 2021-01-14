package view;

import user.*;
import view.CustomerRegistrator;
import view.Park;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
//authorize(String,String):boolean

public class Authorizator {
    public Customer authByCustomer;
    public Administrator administrator;
    List<Customer> customers;
    TextField nickname;
    PasswordField password;
    Button auth;
    Button registration;
    Stage stage;

    public Authorizator() {
        this.nickname = new TextField();
        this.password = new PasswordField();
        auth = new Button("Authorize");
        registration = new Button("Register");
        stage = new Stage();
        VBox root = new VBox();
        root.setSpacing(5);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(new Text("Nickname"),
                nickname,
                new Text("Password"),
                password,
                auth,
                registration);
        stage.setTitle("Authorization");
        stage.setScene(new Scene(root,200,400));
        auth.setOnAction(e->{
            this.authorize(nickname.getText(), password.getText());
            if(authByCustomer== null && administrator.isAuthorised == false){
                nickname.setText("Incorrect nickname or password");
                password.setText("");
            } else {
                nickname.setText("");
                password.setText("");
                Park park = new Park();
            }
        });
        registration.setOnAction(e->{
            CustomerRegistrator customerRegistrator = new CustomerRegistrator();
        });
    }

    public boolean authorize(String nickname, String password){
        if(administrator.nickname.equals(nickname) && administrator.password.equals(password)){
            administrator.isAuthorised=true;
            return true;
        } else {administrator.isAuthorised=false;
        for(Customer customer: customers){
        if(customer.nickname.equals(nickname) && customer.password.equals(password)){
                customer.isAuthorised=true;
                authByCustomer=customer;
                return true;
        } else {customer.isAuthorised=false; authByCustomer=null; return false;}}}
        return true;
    }
}