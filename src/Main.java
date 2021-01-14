import user.Administrator;
import view.*;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        createAuthorizator();
    }

    public Administrator createAdmin(){
        Administrator admin = new Administrator("admin", "admin");
        return admin;
    }

    public Park createPark(){
        Park park = new Park();
        return park;
    }

    public Shop createShop(){
        Shop shop = new Shop();
        return shop;
    }

    public Authorizator createAuthorizator(){
        Authorizator authorizator = new Authorizator();
        return authorizator;
    }

    public CustomerRegistrator createCustomerRegistrator(){
        CustomerRegistrator customerRegistrator = new CustomerRegistrator();
        return customerRegistrator;
    }


    public static void main(String[] args) {
        launch(args);
    }
}