package com.marcelov.example.javafxexample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    public TextField textField;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText(String.format("Hello %s!", textField.getText()));
    }
}