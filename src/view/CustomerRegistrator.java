package view;

import user.Customer;
import view.Park;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.List;

//register(String,String):Customer
//1..1 authorizator
//create ICustomer

public class CustomerRegistrator {
    public Customer authByCustomer;
    List<Customer> customers;
    TextField nickname;
    PasswordField password;
    Button rgstr;
    Stage stage;
    Scene scene;

    public CustomerRegistrator() {
        this.nickname = new TextField();
        this.password = new PasswordField();
        rgstr = new Button("Register");
        stage = new Stage();
        VBox root = new VBox();
        root.setSpacing(5);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(new Text("Nickname"),
                nickname,
                new Text("Password"),
                password,
                rgstr);
        stage.setTitle("Customer Registration");
        scene=new Scene(root,200,400);
        stage.setScene(scene);
        rgstr.setOnAction(e->{
            customers.add(this.register(nickname.getText(), password.getText()));
            Park park = new Park();
        });
    }

    public Customer register(String nickname, String password){
        Customer customer = new Customer(nickname, password);
        return customer;
    }
}