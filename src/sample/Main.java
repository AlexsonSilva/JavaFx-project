package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Login");
//        primaryStage.setScene(new Scene(root, 800, 533));
//        primaryStage.setResizable(false);
//        primaryStage.show();


//        Parent root = FXMLLoader.load(getClass().getResource("MainPage_Lecturer.fxml"));
//        primaryStage.setTitle("Main Page Lecturer");
//        primaryStage.setScene(new Scene(root, 800, 533));
//        primaryStage.setResizable(false);
//        primaryStage.show();

//        Parent root = FXMLLoader.load(getClass().getResource("MainPage_Student.fxml"));
//        primaryStage.setTitle("Main Page Student");
//        primaryStage.setScene(new Scene(root, 800, 533));
//        primaryStage.setResizable(false);
//        primaryStage.show();

        Parent root = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
        primaryStage.setTitle("Admin Page");
        primaryStage.setScene(new Scene(root, 800, 533));
        primaryStage.setResizable(false);
        primaryStage.show();

//        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
//        primaryStage.setTitle("Login Page");
//        primaryStage.setScene(new Scene(root, 800, 533));
//        primaryStage.setResizable(false);
//        primaryStage.show();


    }



    public static void main(String[] args) { launch(args);
    }

}
