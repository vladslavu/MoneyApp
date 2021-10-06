package com.example.moneyapp;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private VBox vBox;
    @FXML
    private Parent fxml;

    @FXML
    public void openSignIn(ActionEvent ev) {
        TranslateTransition t = new TranslateTransition(Duration.seconds(1), vBox);
        t.setToX(vBox.getLayoutX() * 23.1);
        t.play();
        t.setOnFinished((e) -> {
            try {
                fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sign-in-view.fxml")));
                vBox.getChildren().removeAll();
                vBox.getChildren().setAll(fxml);
            }catch (IOException exception){
                System.out.println("Error. Sorry :(");
            }
        });
    }

    @FXML
    public void openSignUp(ActionEvent ev) {
        TranslateTransition t = new TranslateTransition(Duration.seconds(1), vBox);
        t.setToX(0);
        t.play();
        t.setOnFinished((e) -> {
            try {
                fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sign-up-form.fxml")));
                vBox.getChildren().removeAll();
                vBox.getChildren().setAll(fxml);
            }catch (IOException exception){
                System.out.println("Error. Sorry :(");
            }
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition t = new TranslateTransition(Duration.seconds(1), vBox);
        t.setToX(vBox.getLayoutX() * 23.1);
        t.play();
        t.setOnFinished((e) -> {
            try {
                fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sign-in-view.fxml")));
                vBox.getChildren().removeAll();
                vBox.getChildren().setAll(fxml);
            }catch (IOException exception){
                System.out.println("Error. Sorry :(");
            }
        });
    }
}