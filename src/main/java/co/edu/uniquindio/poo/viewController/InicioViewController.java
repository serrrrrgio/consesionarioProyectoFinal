package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;

public class InicioViewController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnSalir;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private Button btnRegistrarse;

    @FXML
    void handleBtnSalir(ActionEvent event) {
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
    }

    @FXML
    void handleBtnIniciarSesion(ActionEvent event) {
        App.cambiarEscena("/co/edu/uniquindio/poo/Inicio.fxml", "Inicio", event, getClass());
    }
    

    @FXML
    void handleBtnRegistrarse(ActionEvent event) {

    }

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
}