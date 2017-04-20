/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrandonnee.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Raouf
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    //  @FXML elle indique que ce que le suit est construit graphiquement !!
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML
    private Label label1;

    @FXML
    private void method2(ActionEvent event) {
        System.out.println("You clicked me!");
        label1.setText("zzzzzzzzzzZZZZZZZZzzzzzzZz");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
