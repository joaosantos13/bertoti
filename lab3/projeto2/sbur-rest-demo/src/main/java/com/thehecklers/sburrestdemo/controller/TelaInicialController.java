package com.thehecklers.sburrestdemo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

@Component
public class TelaInicialController {

    public void abrirProdutos(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/produtos.fxml"));

        Stage stage = new Stage();
        stage.setTitle("Mercadinho de Vegetais");
        stage.setScene(new Scene(root, 800, 500));
        stage.show();
    }
}