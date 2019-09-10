package br.senac.com.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaController implements Initializable {

    @FXML
    private TextField lbNomeDoJogo;
    @FXML
    private Label lbQtdRestante;
    @FXML
    private ComboBox<String> comboBox;

    private String[] lista = new String[10];
    private int listaCount = 0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbQtdRestante.setText("Jogos restantes: 10");
    }

    @FXML
    private void btCadastrar(ActionEvent event) {
        if (listaCount >= 10) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erro ao cadastrar");
            alert.setHeaderText("");
            alert.setContentText("O limite de jogos foi atingido!");

            alert.showAndWait();
        } else {
            for (int i = 0; i < lista.length; i++) {
                if (lbNomeDoJogo.getText().equals(lista[i]) || lbNomeDoJogo.getText().isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Erro ao cadastrar"); 
                    alert.setHeaderText("");
                    alert.setContentText("Jogo ja cadastrado ou espaco vazio!");

                    alert.showAndWait();
                    break;
                } else {
                    lista[listaCount] = lbNomeDoJogo.getText(); //comeca com 0
                    comboBox.getItems().add(lista[listaCount]);
                    listaCount++;
                    lbNomeDoJogo.setText("");
                    lbQtdRestante.setText("Jogos restantes: " + (10 - listaCount));
                    break;
                }
            }
        }
    }
}
