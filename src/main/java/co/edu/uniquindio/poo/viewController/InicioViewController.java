package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;

public class InicioViewController {

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private ImageView backgroundImage; // Asegúrate de que este ID coincide con el del FXML

    @FXML
    public void initialize() {


        // Establecer efectos de hover para los botones
        setButtonHoverEffect(btnSalir);
        setButtonHoverEffect(btnIniciarSesion);
        setButtonHoverEffect(btnRegistrarse);
    }

    private void setButtonHoverEffect(Button button) {
        button.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        button.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> {
            button.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        });
        button.addEventHandler(MouseEvent.MOUSE_EXITED, e -> {
            button.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        });
    }

    @FXML
    private void handleBtnSalir(ActionEvent event) {
        System.out.println("Botón Salir presionado");
        // Aquí puedes cerrar la aplicación o hacer cualquier acción que desees.
    }

    @FXML
    private void handleBtnIniciarSesion(ActionEvent event) {
        System.out.println("Botón Iniciar Sesión presionado");
        // Agrega la lógica de inicio de sesión aquí.
    }

    @FXML
    private void handleBtnRegistrarse(ActionEvent event) {
        System.out.println("Botón Registrarse presionado");
        // Agrega la lógica de registro aquí.
    }
}
