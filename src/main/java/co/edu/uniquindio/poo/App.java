package co.edu.uniquindio.poo;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App {

    public static void main(String[] args) {
        // Llamar a la función launchApp en el hilo de JavaFX
        Platform.startup(() -> launchApp());
    }

    public static void launchApp() {
        try {
            // Cargar el archivo FXML
            Parent root = FXMLLoader.load(App.class.getResource("Inicio.fxml"));
            Scene scene = new Scene(root);
            
            // Crear Stage y configurar propiedades
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Mi Aplicación");
            
            // Centrar la ventana en la pantalla
            stage.centerOnScreen();
            
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}