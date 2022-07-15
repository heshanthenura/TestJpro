package com.heshan.testjpro;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Text greet;

    @FXML
    private TextField name;

    @FXML
    void name(KeyEvent event) {
        greet.setText("Welcome !!, "+name.getText());
        greet.setVisible(true);
        System.out.println("Welcome !!, "+name.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        greet.setVisible(false);
    }
}