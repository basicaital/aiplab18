package org.example.aiplab18;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CharForm extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("chatform.fxml"));
        stage.setTitle("Simple Chat Form");
        stage.setScene(new Scene(root, 450, 450));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}