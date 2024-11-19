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
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.PreguntaSeguridad;

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
        Empleado empleadoPrueba = new Empleado(
                "Joab", // Nombre
                "Suarez", // Apellido
                "joab@gmail.com", // Correo
                "1", // Cédula
                "3014750404", // Teléfono
                "JoabS", // Usuario
                "1", // Contraseña
                PreguntaSeguridad.FAVORITE_COLOR, // Pregunta de seguridad
                "Negro", // Respuesta a la pregunta de seguridad
                2500.0 // Salario
        );
        Cliente cliente = new Cliente("Sergio", // Nombre
                "Posada", // Apellido
                "Sergio@gmail.com", // Correo
                "1", // Cédula
                "3014750404", // Teléfono
                "Sergi", // Usuario
                "1", // Contraseña
                PreguntaSeguridad.FAVORITE_COLOR, // Pregunta de seguridad
                "Negro" // Respuesta a la pregunta de seguridad
        );

        administrador = new Administrador("Maicol", "Alvarez", "michael@gmail.com", "1", "310", "maicol", "12345",
                PreguntaSeguridad.BEST_FRIEND, "Victoria");

        concesionario = new Concesionario("Chevrolet", 130909002, administrador);
        concesionario.agregarEmpleado(empleadoPrueba);
        concesionario.agregarCliente(cliente);
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