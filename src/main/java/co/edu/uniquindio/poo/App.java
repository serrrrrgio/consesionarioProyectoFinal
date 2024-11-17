package co.edu.uniquindio.poo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Concesionario;

/**
 * JavaFX App
 */
public class App {

    private static Concesionario concesionario;
    private static Administrador administrador;

    public static void main(String[] args) {
        // Llamar a la función launchApp en el hilo de JavaFX
        Platform.startup(() -> launchApp());
    }

    public static void launchApp() {
        administrador = new Administrador("Maicol", "Alvarez", "michael@gmail.com", "1", "310", "maicol", "12345", null, null);
        concesionario = new Concesionario("Chevrolet", 130909002, administrador);
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

    public static Concesionario getConcesionario() {
        return concesionario;
    }

    public static void setConcesionario(Concesionario nuevoConcesionario) {
        concesionario = nuevoConcesionario;
    }

    public static void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public static void mostrarMensaje(String titulo, String header, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(header);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public static void cambiarEscena(String fxml, String titulo, ActionEvent event, Class<?> clase) {
        try {
            FXMLLoader loader = new FXMLLoader(clase.getResource(fxml));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setButtonHoverEffect(Button button) {
        button.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        button.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> {
            button.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        });
        button.addEventHandler(MouseEvent.MOUSE_EXITED, e -> {
            button.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        });
    }

}