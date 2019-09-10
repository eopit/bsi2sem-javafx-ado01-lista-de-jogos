package br.senac.com.lista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class lista extends Application {
    
    public void start(Stage stage) throws Exception {
        Parent telaLista = FXMLLoader.load(getClass().getResource("/br/senac/com/gui/tela.fxml"));
        
        Scene scene = new Scene (telaLista);
        
        stage.setScene(scene);
        stage.setTitle("Lista de jogos");
        stage.show();
    }
}
